package com.ebuytech.svc.easybuy.dao;

import com.ebuytech.svc.easybuy.entity.AccountRefund;
import com.ebuytech.svc.easybuy.entity.AccountRefundExample;
import org.springframework.stereotype.Repository;

/**
 * AccountRefundDAO继承基类
 */
@Repository public interface AccountRefundDAO extends MyBatisBaseDao<AccountRefund, String, AccountRefundExample> {
}
