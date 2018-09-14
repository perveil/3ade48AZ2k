package com.ebuytech.svc.easybuy.dao;

import com.ebuytech.svc.easybuy.entity.ValueCard;
import com.ebuytech.svc.easybuy.entity.ValueCardExample;
import org.springframework.stereotype.Repository;

/**
 * ValueCardDAO继承基类
 */
@Repository public interface ValueCardDAO extends MyBatisBaseDao<ValueCard, String, ValueCardExample> {
}
