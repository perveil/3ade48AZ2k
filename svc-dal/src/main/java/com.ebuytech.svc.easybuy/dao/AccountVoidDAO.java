package com.ebuytech.svc.easybuy.dao;

import com.ebuytech.svc.easybuy.entity.AccountVoid;
import com.ebuytech.svc.easybuy.entity.AccountVoidExample;
import org.springframework.stereotype.Repository;

/**
 * AccountVoidDAO继承基类
 */
@Repository public interface AccountVoidDAO extends MyBatisBaseDao<AccountVoid, String, AccountVoidExample> {
}
