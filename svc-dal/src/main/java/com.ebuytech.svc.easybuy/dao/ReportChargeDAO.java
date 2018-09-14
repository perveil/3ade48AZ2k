package com.ebuytech.svc.easybuy.dao;

import com.ebuytech.svc.easybuy.entity.ReportCharge;
import com.ebuytech.svc.easybuy.entity.ReportChargeExample;
import org.springframework.stereotype.Repository;

/**
 * ReportChargeDAO继承基类
 */
@Repository
public interface ReportChargeDAO extends MyBatisBaseDao<ReportCharge, Integer, ReportChargeExample> {
}