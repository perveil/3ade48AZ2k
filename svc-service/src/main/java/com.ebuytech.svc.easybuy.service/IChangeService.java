package com.ebuytech.svc.easybuy.service;

import com.ebuytech.svc.easybuy.entity.Account;
import com.ebuytech.svc.easybuy.entity.AccountChange;

import java.util.List;

/**
 * 账单
 */
public interface IChangeService {

    /**
     * zty
     * 查询交易记录
     * @param pageNum
     * @return
     */
    List<AccountChange> queryChangeListByPage(int pageNum);

    /**
     * lei
     * 根据订单类型查询
     * @param pageNum
     * @param type
     * @return
     */
    List<AccountChange> queryChangeListByType(int pageNum, int type);

    /**
     * zty
     * 根据时间查询
     * @param pageNum
     * @param time
     * @return
     */
    List<AccountChange> queryChangeListByTime(int pageNum, String time);

    /**
     * zty
     * 根据时间段查询
     * @param pageNum
     * @param time1
     * @param time2
     * @return
     */
    List<AccountChange> queryChangeListByTimeScale(int pageNum, String time1, String time2);

    /**
     * 查询
     * @param pageNum
     * @param phone
     * @return
     */
    List<AccountChange> queryChangeListByPhone(int pageNum, String phone);

    List<AccountChange> queryChangeListByValueCard(int pageNum, String cardId);
}
