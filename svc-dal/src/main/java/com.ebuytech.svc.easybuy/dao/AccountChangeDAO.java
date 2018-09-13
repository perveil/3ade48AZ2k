package com.ebuytech.svc.easybuy.dao;

import com.ebuytech.svc.easybuy.entity.AccountChange;
import com.ebuytech.svc.easybuy.entity.AccountChangeExample;
import org.springframework.stereotype.Repository;

/**
 * AccountChangeDAO继承基类
 */
@Repository
public interface AccountChangeDAO extends MyBatisBaseDao<AccountChange, String, AccountChangeExample> {
}