package com.ebuytech.svc.easybuy.dao;

import com.ebuytech.svc.easybuy.entity.AccountSale;
import com.ebuytech.svc.easybuy.entity.AccountSaleExample;
import org.springframework.stereotype.Repository;

/**
 * AccountSaleDAO继承基类
 */
@Repository public interface AccountSaleDAO extends MyBatisBaseDao<AccountSale, String, AccountSaleExample> {
}
