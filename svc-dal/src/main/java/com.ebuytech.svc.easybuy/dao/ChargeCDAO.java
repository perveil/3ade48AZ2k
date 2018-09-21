package com.ebuytech.svc.easybuy.dao;

import com.ebuytech.svc.easybuy.entity.Charge;
import com.ebuytech.svc.easybuy.entity.ChargeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository public interface ChargeCDAO extends MyBatisBaseDao<Charge, Integer, ChargeExample> {

    int updateChargeIsValidById(@Param("chargeId")int chargeId, @Param("isValid")int isValid);
}
