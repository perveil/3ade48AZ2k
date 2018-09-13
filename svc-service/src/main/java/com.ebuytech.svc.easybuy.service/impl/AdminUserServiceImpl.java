package com.ebuytech.svc.easybuy.service.impl;

import com.ebuytech.svc.easybuy.dao.AdminUserDAO;
import com.ebuytech.svc.easybuy.service.IAdminUserService;
import com.ebuytech.svc.easybuy.util.MD5Utils;
import com.ebuytech.svc.easybuy.vo.AdminToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;
import java.util.UUID;

/**
 * Created by Eric3 on 2018/9/13.
 */
@Service
@Transactional
public class AdminUserServiceImpl implements IAdminUserService {

    @Autowired
    private AdminUserDAO adminUserDAO;


    @Override
    public AdminToken login(String userName, String userPwd) {
        userPwd = MD5Utils.getMD5(MD5Utils.getMD5(MD5Utils.getMD5(userPwd)));
        Integer count = adminUserDAO.selectAdmin(userName, userPwd);
        if (count == 0) {
            //TODO throw new UserException(ResultEnums.USER_NOTINDB);
        }
        Random random = new Random();
        String salt = random.nextInt(36) + System.currentTimeMillis() + "";
        String newToken = MD5Utils.getMD5(MD5Utils.getMD5(MD5Utils.getMD5(userName + salt)));
        long newExpireTime = System.currentTimeMillis() + 7 * 24 * 60 * 30 * 1000;
        AdminToken newAdminToken = new AdminToken();
        newAdminToken.setToken(newToken);
        return newAdminToken;
    }

    @Override
    public boolean checkToken(String userId, String token) {
        return false;
    }
}
