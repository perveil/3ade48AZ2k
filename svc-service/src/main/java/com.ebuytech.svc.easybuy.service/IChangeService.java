package com.ebuytech.svc.easybuy.service;

import com.ebuytech.svc.easybuy.entity.AccountChange;
import com.ebuytech.svc.easybuy.vo.AccountChangeDetailVO;
import com.ebuytech.svc.easybuy.vo.AccountChangeVO;
import com.ebuytech.svc.easybuy.vo.ChangeForm;
import com.ebuytech.svc.easybuy.vo.ChangeTransVO;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 账单
 */
public interface IChangeService {

    /**
     * zty
     * 查询交易记录
     *
     * @param pageNum
     * @return
     */
    ChangeTransVO queryChangeListByPage (int pageNum , String timeType , String time, String type, String phone,
                                        String valueCardId, String accountChangeId);

    /**
     * lei
     * 根据订单类型查询
     *
     * @param pageNum
     * @param type
     * @return
     */
    AccountChangeVO queryChangeListByType(int pageNum, int type, String accountId);

    AccountChangeDetailVO queryChangeDetail(String accountChangeId);

    /**
     * zty
     * 根据时间查询
     *
     * @param pageNum
     * @param time
     * @return
     */
    List<AccountChange> queryChangeListByTime(int pageNum, String time);

    /**
     * zty
     * 根据时间段查询
     *
     * @param pageNum
     * @param time1
     * @param time2
     * @return
     */
    PageInfo<AccountChange> queryChangeListByTimeScale(int pageNum, String time1, String time2);

    /**
     * 查询
     *
     * @param pageNum
     * @param phone
     * @return
     */
    List<AccountChange> queryChangeListByPhone(int pageNum, String phone);

    AccountChangeVO queryChangeListByValueCard(int pageNum, String accountId);

    PageInfo<AccountChange> queryChangeListByCard(int pageNum, String cardId);

}
