package com.ebuytech.svc.easybuy.service.impl;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import com.ebuytech.svc.easybuy.dao.AccountDAO;
import com.ebuytech.svc.easybuy.dao.AdminUserDAO;
import com.ebuytech.svc.easybuy.entity.Account;
import com.ebuytech.svc.easybuy.entity.AccountExample;
import com.ebuytech.svc.easybuy.entity.AdminUserExample;
import com.ebuytech.svc.easybuy.enums.ResultEnums;
import com.ebuytech.svc.easybuy.exception.AdminException;
import com.ebuytech.svc.easybuy.exception.ClientException;
import com.ebuytech.svc.easybuy.service.IAccountService;
import com.ebuytech.svc.easybuy.service.IAdminService;
import com.ebuytech.svc.easybuy.util.*;
import com.ebuytech.svc.easybuy.vo.AccountToken;
import com.ebuytech.svc.easybuy.vo.AccountVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.error.WxErrorException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service @Transactional
@Slf4j
public class AccountServiceImpl implements IAccountService {
    @Resource private WxMaService wxService;

    @Resource private RedisUtil redisUtil;

    @Resource private AccountDAO accountDAO;
    public static final long TOKEN_EXPIRE_TIME = 3600 * 24 * 30;

    @Override public AccountToken login(String code) {
        if (StringUtils.isBlank(code)) {
            throw new ClientException(ResultEnums.USER_CODE_NULL);
        }

        try {
            WxMaJscode2SessionResult session = wxService.getUserService().getSessionInfo(code);
            String openId = session.getOpenid();
            String sessionKey = session.getSessionKey();
            // AccountExample accountExample = new AccountExample();
            String token = MD5Utils.getMD5(MD5Utils.getMD5(MD5Utils.getMD5(sessionKey)));
            String userInfo = openId + "," + sessionKey;
            redisUtil.set(token, userInfo, TOKEN_EXPIRE_TIME);
            AccountToken accountToken = new AccountToken();
            accountToken.setOpenId(openId);
            accountToken.setSessionCode(token);
            return accountToken;
        } catch (WxErrorException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override public boolean checkSessionCode(String openId, String sessionCode) {
        return false;
    }

    @Override public AccountVO queryAccountListByPage(int page) {
        AccountVO accountVO = new AccountVO();
        AccountExample accountExample = new AccountExample();
        AccountExample.Criteria filter = accountExample.createCriteria();
        filter.andAccountIdIsNotNull();
        PageHelper.startPage(page,10);
        List<Account> accountList= accountDAO.selectByExample(accountExample);
        PageInfo pageInfo = new PageInfo(accountList);
        accountVO.setAccountList(accountList);
        accountVO.setTotalPage(pageInfo.getPages());
        accountVO.setTotalResult(pageInfo.getTotal());
        if (page < 0) {
            log.error("【查询用户列表】 页码不应小于0");
            throw new AdminException(ResultEnums.QUERY_PAGE_NOT_RIGHT);
        }
        return accountVO;
//
//        accountExample.setLimit(15);
//        accountExample.setOffset((long) (page * 15));

        //return accountDAO.selectByExample(accountExample);
    }

    @Override public Account queryAccountInfo(String openId) {
        AccountExample accountExample = new AccountExample();
        accountExample.createCriteria().andOpenIdEqualTo(openId);
        List<Account> accountList =  accountDAO.selectByExample(accountExample);
        if (accountList.isEmpty()){
            log.error("【查询用户】 失败，不存在该用户");
            throw new AdminException(ResultEnums.QUERY_USER_NULL);
        }
        Account account = accountList.get(0);
        return account;
    }

    @Override public boolean freezeAccount(String accountId) {
        //判断
        Account account = accountDAO.selectByPrimaryKey(accountId);
        if (account == null){
            log.error("【冻结账户】 不存在该用户");
            throw new AdminException(ResultEnums.QUERY_USER_NULL);
        }
        if (account.getStatus() == 1){
            log.error("【冻结账户】 该账户已经冻结");
            throw new AdminException(ResultEnums.ACCOUNT_FREEZEN);
        }
        account.setStatus(1);
        accountDAO.updateByPrimaryKey(account);
        return true;

    }

    @Override public boolean addBalance(String accountId, int balance) {
        Account account = accountDAO.selectByPrimaryKey(accountId);
        if (account == null) {
            log.error("【添加余额】 不存在该用户");
            throw new AdminException(ResultEnums.QUERY_USER_NULL);
        }
        /*if (balance <= 0) {
            log.error("【添加余额】 添加的金额不能为负");
            throw new AdminException(ResultEnums.BALANCE_NEGATIVE);
        }*/
        int before = account.getBalance();
        account.setBalance(before+balance);
        accountDAO.updateByPrimaryKey(account);
        return true;
    }
}
