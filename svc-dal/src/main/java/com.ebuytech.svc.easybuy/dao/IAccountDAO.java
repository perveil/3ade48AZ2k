package com.ebuytech.svc.easybuy.dao;

import com.ebuytech.svc.easybuy.entity.Account;
import com.ebuytech.svc.easybuy.entity.AccountExample;
import org.springframework.stereotype.Repository;

/**
 * IAccountDAO继承基类
 */
@Repository
public interface IAccountDAO extends MyBatisBaseDao<Account, String, AccountExample> {
}