package com.ebuytech.svc.easybuy.service.impl;

import com.alibaba.druid.support.json.JSONUtils;
import com.ebuytech.svc.easybuy.dao.ActivityDAO;
import com.ebuytech.svc.easybuy.entity.Activity;
import com.ebuytech.svc.easybuy.entity.ActivityExample;
import com.ebuytech.svc.easybuy.service.IActivityService;
import com.ebuytech.svc.easybuy.vo.PageVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by HYS on 2018/9/15.
 */
@Service
public class ActivityServiceImpl implements IActivityService {

    @Autowired ActivityDAO activityDAO;

    @Override public PageVO<Activity> queryActivityListByPage(int pageNum,int size) {

        PageVO<Activity> activityPageVO = new PageVO();
        ActivityExample activityExample = new ActivityExample();
        ActivityExample.Criteria filter = activityExample.createCriteria();
        filter.andActIdIsNotNull();
        PageHelper.startPage(pageNum,size);
        List<Activity> activities = activityDAO.selectByExample(activityExample);
        PageInfo pageInfo = new PageInfo(activities);
        activityPageVO.setList(activities);
        activityPageVO.setTotalPage(pageInfo.getPages());
        activityPageVO.setTotalResult(pageInfo.getTotal());


        return activityPageVO;
    }

    @Override public boolean addActivity(int status, int actType, int cntType, String cntInfo,
                                     int actMoney, int actCount,String startTime,String endTime) {

        Activity activity = new Activity();
        activity.setStatus(status);
        activity.setActType(actType);
        activity.setCntType(cntType);
        activity.setCntInfo(cntInfo);
        activity.setActMoney(actMoney);
        activity.setActCount(actCount);
        activity.setStartTime(startTime);
        activity.setEndTime(endTime);

        return activityDAO.insert(activity) > 0;
    }

    @Override public Activity queryActivityByPrimaryKey(int actId) {

        Activity activity = activityDAO.selectByPrimaryKey(actId);

        return activity;
    }

    @Override public boolean updateActivityStatus(int actId,int status) {

        return activityDAO.updateStatus(actId,status) > 0;
    }

    @Override public boolean updateActivityById(int actId, int actType, String startTime, String endTime, int actMoney, int cntType, int status, int actCount, String cntInfo) {

        Activity activity = new Activity();
        activity.setActId(actId);
        activity.setActType(actType);
        activity.setStartTime(startTime);
        activity.setEndTime(endTime);
        activity.setActMoney(actMoney);
        activity.setCntType(cntType);
        activity.setCntInfo(cntInfo);
        activity.setActCount(actCount);
        activity.setStatus(status);

        return activityDAO.updateByPrimaryKey(activity) > 0;
    }
}
