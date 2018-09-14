package com.ebuytech.svc.easybuy.dao;

import com.ebuytech.svc.easybuy.entity.Charge;
import com.ebuytech.svc.easybuy.entity.ChargeExample;
import org.springframework.stereotype.Repository;

/**
 * ChargeDAO继承基类
 */
@Repository public interface ChargeDAO extends MyBatisBaseDao<Charge, Integer, ChargeExample> {
}
