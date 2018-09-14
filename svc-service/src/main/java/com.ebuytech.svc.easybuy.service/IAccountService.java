package com.ebuytech.svc.easybuy.service;

import com.ebuytech.svc.easybuy.entity.Account;
import com.ebuytech.svc.easybuy.vo.AccountToken;
import com.ebuytech.svc.easybuy.vo.AccountVO;

import java.util.List;

public interface IAccountService {
    /**
     * lei
     * 小程序登录
     *
     * @param code
     * @return
     */
    AccountToken login(String code);

    /**
     * lei
     * 检查第三方session
     *
     * @param openId
     * @param sessionCode
     * @return
     */
    boolean checkSessionCode(String openId, String sessionCode);

    /**
     * zty
     * 查询储值卡会员列表
     *
     * @return
     */
    AccountVO queryAccountListByPage(int page);

    /**
     * zty
     * 查询单个账户详情
     *
     * @param openId
     * @return
     */
    Account queryAccountInfo(String openId);

    /**
     * zty
     * 冻结账户
     *
     * @param accountId
     * @return
     */
    boolean freezeAccount(String accountId);

    /**
     * zty
     * 添加余额
     *
     * @param accountId
     * @param balance
     * @return
     */
    boolean addBalance(String accountId, int balance);

}
