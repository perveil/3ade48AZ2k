package com.ebuytech.svc.easybuy.service.impl;

import com.ebuytech.svc.easybuy.dao.AdminUserDAO;
import com.ebuytech.svc.easybuy.entity.AdminUser;
import com.ebuytech.svc.easybuy.entity.AdminUserExample;
import com.ebuytech.svc.easybuy.enums.ResultEnums;
import com.ebuytech.svc.easybuy.exception.AdminException;
import com.ebuytech.svc.easybuy.service.IAdminService;
import com.ebuytech.svc.easybuy.util.MD5Utils;
import com.ebuytech.svc.easybuy.util.RedisUtil;
import com.ebuytech.svc.easybuy.vo.AdminToken;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Random;

/**
 * Created by Eric3 on 2018/9/13.
 */
@Transactional @Service @Slf4j public class AdminServiceImpl implements IAdminService {

    @Autowired private AdminUserDAO adminUserDAO;

    @Autowired private RedisUtil redisUtil;

    @Override public AdminToken login(String userName, String userPwd) {
        userPwd = MD5Utils.getMD5(MD5Utils.getMD5(MD5Utils.getMD5(userPwd)));
        AdminUserExample adminUserExample = new AdminUserExample();
        adminUserExample.createCriteria().andUserNameEqualTo(userName).andUserPwdEqualTo(userPwd);
        AdminUser adminUser = adminUserDAO.selectByExample(adminUserExample).get(0);
        if (adminUser == null) {
            log.error("【登陆】 登陆异常，用户不存在");
            throw new AdminException(ResultEnums.USER_NOTINDB);
        }
        Random random = new Random();
        String salt = random.nextInt(36) + System.currentTimeMillis() + "";
        String newToken = MD5Utils.getMD5(MD5Utils.getMD5(MD5Utils.getMD5(userName + salt)));
        long newExpireTime = System.currentTimeMillis() + 7 * 24 * 60 * 30 * 1000;
        redisUtil.set(userName, newToken);
        redisUtil.setExpireTime(userName, newExpireTime);
        AdminToken newAdminToken = new AdminToken();
        newAdminToken.setToken(newToken);
        newAdminToken.setUserId(adminUser.getUserId());
        return newAdminToken;
    }

    @Override public boolean checkToken(String userId, String token) {
        String token1 = (String) redisUtil.get(userId);
        if (StringUtils.isEmpty(token1)) {
            return false;
        }
        return token1.equals(token);
    }

    @Override public boolean modifyPwd(String userId, String oldPwd, String newPwd) {
        oldPwd = MD5Utils.getMD5(MD5Utils.getMD5(MD5Utils.getMD5(oldPwd)));
        AdminUserExample adminUserExample = new AdminUserExample();
        adminUserExample.createCriteria().andUserPwdEqualTo(oldPwd).andUserIdEqualTo(userId);
        List<AdminUser> adminUserList = adminUserDAO.selectByExample(adminUserExample);
        if (adminUserList == null || adminUserList.size() <= 0 ) {
            log.error("【修改密码】 用户名或密码错误");
            throw new AdminException(ResultEnums.ID_OR_PASSWORD_NOT_RIGHT);
        }
        newPwd = MD5Utils.getMD5(MD5Utils.getMD5(MD5Utils.getMD5(newPwd)));
        if (newPwd.equals(oldPwd)) {
            log.error("【修改密码】 新密码不能与原密码相同");
            throw new AdminException(ResultEnums.NEWPASSWORD_EQUAL_OLDPASSWORD);
        }
        AdminUser adminUser = adminUserList.get(0);
        adminUser.setUserPwd(newPwd);
        adminUserDAO.updateByPrimaryKey(adminUser);
        return true;
    }

    @Override public String addUser(String userName, String userPwd, int roleId) {
        return null;
    }
}
