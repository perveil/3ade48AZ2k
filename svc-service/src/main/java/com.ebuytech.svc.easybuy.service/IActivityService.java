package com.ebuytech.svc.easybuy.service;

import com.ebuytech.svc.easybuy.entity.Activity;
import com.ebuytech.svc.easybuy.vo.PageVO;

import java.util.List;

public interface IActivityService {

    /**
     * zty
     * 获取活动列表
     *
     * @param pageNum
     * @return
     */
    PageVO<Activity> queryActivityListByPage(int pageNum,int size);

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
    boolean addActivity(int status, int actType, int cntType, String cntInfo, int actMoney, int actCount,String startTime,String endTime);

    /**
     * 查询单个活动
     * @param actId
     * @return
     */
    Activity queryActivityByPrimaryKey(int actId);

    /**
     * 修改状态
     * @param actId
     * @return
     */
    boolean updateActivityStatus(int actId,int status);

    boolean updateActivityById(int actId,int actType,String startTime,String endTime,int actMoney,int cntType,int status,int actCount,String cntInfo);


}
