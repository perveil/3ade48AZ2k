package com.ebuytech.svc.easybuy.service;

import com.ebuytech.svc.easybuy.entity.Account;
import com.ebuytech.svc.easybuy.vo.AccountToken;

import java.util.List;

public interface IAccountService {
    /**
     * 小程序登录
     * @param code
     * @return
     */
    AccountToken login(String code);

    /**
     * 检查第三方session
     * @param openId
     * @param sessionCode
     * @return
     */
    boolean checkSessionCode(String openId, String sessionCode);

    /**
     * 查询储值卡会员列表
     * @return
     */
    List<Account> queryAccountList();

    /**
     * 查询单个账户详情
     * @param openId
     * @return
     */
    Account queryAccountInfo(String openId);

    /**
     * 冻结账户
     * @param accountId
     * @return
     */
    boolean freezeAccount(String accountId);
}
