package com.ebuytech.svc.easybuy.dao;

import com.ebuytech.svc.easybuy.entity.ReportSale;
import com.ebuytech.svc.easybuy.entity.ReportSaleExample;
import org.springframework.stereotype.Repository;

/**
 * ReportSaleDAO继承基类
 */
@Repository public interface ReportSaleDAO extends MyBatisBaseDao<ReportSale, Integer, ReportSaleExample> {
}
