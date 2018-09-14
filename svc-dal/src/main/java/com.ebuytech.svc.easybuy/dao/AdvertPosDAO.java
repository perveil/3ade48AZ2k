package com.ebuytech.svc.easybuy.dao;

import com.ebuytech.svc.easybuy.entity.AdvertPos;
import com.ebuytech.svc.easybuy.entity.AdvertPosExample;
import org.springframework.stereotype.Repository;

/**
 * AdvertPosDAO继承基类
 */
@Repository public interface AdvertPosDAO extends MyBatisBaseDao<AdvertPos, Integer, AdvertPosExample> {
}
