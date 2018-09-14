package com.ebuytech.svc.easybuy.dao;

import com.ebuytech.svc.easybuy.entity.AccountCharge;
import com.ebuytech.svc.easybuy.entity.AccountChargeExample;
import org.springframework.stereotype.Repository;

/**
 * AccountChargeDAO继承基类
 */
@Repository public interface AccountChargeDAO extends MyBatisBaseDao<AccountCharge, String, AccountChargeExample> {
}
