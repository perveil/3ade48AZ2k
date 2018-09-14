package com.ebuytech.svc.easybuy.service;

import com.ebuytech.svc.easybuy.entity.AccountChange;

import java.util.List;

/**
 * 账单
 */
public interface IChangeService {

    List<AccountChange> getChangeListByPage(int pageNum);
}
