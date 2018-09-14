package com.ebuytech.svc.easybuy.service;

import com.ebuytech.svc.easybuy.entity.Activity;

import java.util.List;

public interface IActivityService {

    List<Activity> getActivityListByPage(int pageNum);

    boolean addActivity(int status, int actType, int cntType, String cntInfo, int actMoney, int actCount);


}
