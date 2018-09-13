package com.ebuytech.svc.easybuy.service.impl;


import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import com.ebuytech.svc.easybuy.dao.AccountDAO;
import com.ebuytech.svc.easybuy.entity.Account;
import com.ebuytech.svc.easybuy.entity.AccountExample;
import com.ebuytech.svc.easybuy.service.IAccountService;
import com.ebuytech.svc.easybuy.util.*;
import com.ebuytech.svc.easybuy.vo.AccountToken;
import me.chanjar.weixin.common.error.WxErrorException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class AccountServiceImpl implements IAccountService {
    @Resource
    private WxMaService wxService;

    @Resource
    private AccountDAO accountDAO;

    @Override
    public AccountToken login(String code) {
        if (StringUtils.isBlank(code)) {
            throw new ClientException(ClientEnums.ADMIN_CODE_NULL);
        }

        try {
            WxMaJscode2SessionResult session = this.wxService.getUserService().getSessionInfo(code);
            String openId = session.getOpenid();
            String sessionKey = session.getSessionKey();
            //AccountExample accountExample = new AccountExample();
            String token  = MD5Utils.getMD5(MD5Utils.getMD5(MD5Utils.getMD5(sessionKey)));
            RedisUtil.set()
            String uuid = UUIDUtils.getUUID();
            AccountToken accountToken = new AccountToken();
            accountToken.setOpenId(openId);
            accountToken.setAccountId(uuid);
            accountToken.setSessionCode(newAccountToken);
            accountDAO.insert()
            System.out.println(accountToken);
            return accountToken;
        } catch (WxErrorException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean checkSessionCode(String openId, String sessionCode) {
        return false;
    }

    @Override
    public List<Account> queryAccountList() {
        return null;
    }

    @Override
    public Account queryAccountInfo(String openId) {
        return null;
    }

    @Override
    public boolean freezeAccount(String accountId) {
        return false;
    }
}
