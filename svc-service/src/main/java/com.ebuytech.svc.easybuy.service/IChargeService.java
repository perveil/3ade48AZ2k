package com.ebuytech.svc.easybuy.service;

import com.ebuytech.svc.easybuy.entity.Charge;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface IChargeService {

    /**
     * 获取充值列表
     *
     * @param pageNum
     * @return
     */
    PageInfo<Charge> queryChargeListByPage(int pageNum, int size);

    /**
     * 添加充值
     *
     * @param chargeMoney
     * @param actId
     * @param validType
     * @param validTime
     * @return
     */
    boolean addCharge(int chargeMoney, int actId, int validType, String validTime,int chargeType,int isValid);

    /**
     * 查询单个charge
     * @param chargeId
     * @return
     */
    Charge queryChargeById(int chargeId);

    /**
     * 修改状态
     * @param chargeId
     * @param isValid
     * @return
     */
    boolean updateChargeisValidById(int chargeId,int isValid);

    /**
     * 修改charge
     * @param charge
     * @return
     */
    boolean updateCharge(Charge charge);

}
