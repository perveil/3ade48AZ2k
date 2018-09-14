package com.ebuytech.svc.easybuy.dao;

import com.ebuytech.svc.easybuy.entity.AccountChargeVoid;
import com.ebuytech.svc.easybuy.entity.AccountChargeVoidExample;
import org.springframework.stereotype.Repository;

/**
 * AccountChargeVoidDAO继承基类
 */
@Repository public interface AccountChargeVoidDAO extends MyBatisBaseDao<AccountChargeVoid, String, AccountChargeVoidExample> {
}
