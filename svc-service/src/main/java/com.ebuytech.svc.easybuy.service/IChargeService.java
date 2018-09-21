package com.ebuytech.svc.easybuy.service;

import com.ebuytech.svc.easybuy.entity.Charge;
import com.github.binarywang.wxpay.bean.result.WxPayUnifiedOrderResult;
import com.github.pagehelper.PageInfo;

import javax.servlet.http.HttpServletRequest;
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
    boolean addCharge(int chargeMoney, int actId, int validType, String validTime, int chargeType,int isValid);

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

    boolean createOrder(String body, Integer totalFee, String openId);

    WxPayUnifiedOrderResult unifiedOrder(String body, Integer totalFee,String accountId);

    boolean payNotify(HttpServletRequest request);

    boolean closeOrder(String outTradeNo);

    boolean refundOrder(String accountId, String accountChangeId);

    String payConfirm(HttpServletRequest request);
}
