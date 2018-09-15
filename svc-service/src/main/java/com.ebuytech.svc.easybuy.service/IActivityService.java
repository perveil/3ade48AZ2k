package com.ebuytech.svc.easybuy.service;

import com.ebuytech.svc.easybuy.entity.Activity;

import java.util.List;

public interface IActivityService {

    /**
     * zty
     * 获取活动列表
     *
     * @param pageNum
     * @return
     */
    List<Activity> queryActivityListByPage(int pageNum);

    /**
     * zty
     * 添加活动
     *
     * @param status   状态
     * @param actType  活动类型
     * @param cntType  优惠类型
     * @param cntInfo  优惠详情
     * @param actMoney 活动金额
     * @param actCount 活动折扣
     * @return
     */
    int addActivity(int status, int actType, int cntType, String cntInfo, int actMoney, int actCount);

}
