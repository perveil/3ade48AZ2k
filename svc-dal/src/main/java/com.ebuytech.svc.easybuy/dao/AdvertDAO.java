package com.ebuytech.svc.easybuy.dao;

import com.ebuytech.svc.easybuy.entity.Advert;
import com.ebuytech.svc.easybuy.entity.AdvertExample;
import org.springframework.stereotype.Repository;

/**
 * AdvertDAO继承基类
 */
@Repository public interface AdvertDAO extends MyBatisBaseDao<Advert, Integer, AdvertExample> {
}
