package com.ebuytech.svc.easybuy.dao;

import com.ebuytech.svc.easybuy.entity.Store;
import com.ebuytech.svc.easybuy.entity.StoreExample;
import org.springframework.stereotype.Repository;

/**
 * StoreDAO继承基类
 */
@Repository
public interface StoreDAO extends MyBatisBaseDao<Store, String, StoreExample> {
}