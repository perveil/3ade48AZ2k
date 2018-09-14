package com.ebuytech.svc.easybuy.service.impl;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import com.ebuytech.svc.easybuy.dao.AccountDAO;
import com.ebuytech.svc.easybuy.entity.Account;
import com.ebuytech.svc.easybuy.entity.AccountExample;
import com.ebuytech.svc.easybuy.enums.ResultEnums;
import com.ebuytech.svc.easybuy.exception.ClientException;
import com.ebuytech.svc.easybuy.service.IAccountService;
import com.ebuytech.svc.easybuy.util.*;
import com.ebuytech.svc.easybuy.vo.AccountToken;
import me.chanjar.weixin.common.error.WxErrorException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service @Transactional public class AccountServiceImpl implements IAccountService {
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
            AccountExample accountExample = new AccountExample();
            accountExample.createCriteria().andOpenIdEqualTo(openId);
            String token = MD5Utils.getMD5(MD5Utils.getMD5(MD5Utils.getMD5(sessionKey)));
            String userInfo = openId + "," + sessionKey;
            redisUtil.set(token, userInfo, TOKEN_EXPIRE_TIME);
            AccountToken accountToken = new AccountToken();
            accountToken.setOpenId(openId);
            accountToken.setSessionCode(token);
            List<Account> accountList = accountDAO.selectByExample(accountExample);
            if (accountList == null || accountList.size() == 0) {
                accountToken.setIsMember("-1");
                accountToken.setStatus(-1);
            } else {
                Account account = accountList.get(0);
                accountToken.setIsMember(account.getAccountId());
                accountToken.setStatus(account.getStatus());
            }
            return accountToken;
        } catch (WxErrorException e) {
            e.printStackTrace();
        }
        throw new ClientException(ResultEnums.INVALID_CODE);
    }

    @Override public boolean checkSessionCode(String openId, String sessionCode) {
        try {
            if (redisUtil.get(sessionCode) != null) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override public List<Account> queryAccountListByPage(int page) {
        return null;
    }

    @Override public List<Account> queryAccountByKeyword(String phone, String valueCardId, String memberId) {
        return null;
    }

    @Override public Account queryAccountInfo(String openId) {
        return null;
    }

    @Override public boolean freezeAccount(String accountId) {
        return false;
    }

    @Override public boolean addBalance(String accountId, int balance) {
        return false;
    }
}
