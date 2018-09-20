package com.ebuytech.svc.easybuy.service;

import com.ebuytech.svc.easybuy.entity.Account;
import com.ebuytech.svc.easybuy.vo.*;

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
     *
     * @param sessionCode
     * @return
     */
    boolean checkSessionCode( String sessionCode);

    AccountInfoVO checkUser(String openId);

    /**
     * zty
     * 查询储值卡会员列表
     *
     * @return
     */
    AccountVO queryAccountListByPage(int page);

    /**
     * lei
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

    /**
     * zty
     * 根据关键词查询储值卡会员
     *
     * @param phone
     * @param valueCardId
     * @param memberId
     * @return
     */
    AccountVO queryAccountByKeyword(int page, String phone, String valueCardId, String memberId);


}
