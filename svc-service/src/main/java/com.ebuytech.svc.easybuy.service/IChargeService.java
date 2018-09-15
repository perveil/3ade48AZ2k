package com.ebuytech.svc.easybuy.service;

import com.ebuytech.svc.easybuy.entity.Charge;

import java.util.List;

public interface IChargeService {

    /**
     * 获取充值列表
     *
     * @param pageNum
     * @return
     */
    List<Charge> queryChargeListByPage(int pageNum);

    /**
     * 添加充值
     *
     * @param chargeMoney
     * @param actId
     * @param validType
     * @param validTime
     * @return
     */
    boolean addCharge(int chargeMoney, int actId, int validType, String validTime);

}
