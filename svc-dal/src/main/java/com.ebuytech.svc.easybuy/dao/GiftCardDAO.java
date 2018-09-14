package com.ebuytech.svc.easybuy.dao;

import com.ebuytech.svc.easybuy.entity.GiftCard;
import com.ebuytech.svc.easybuy.entity.GiftCardExample;
import org.springframework.stereotype.Repository;

/**
 * GiftCardDAO继承基类
 */
@Repository public interface GiftCardDAO extends MyBatisBaseDao<GiftCard, String, GiftCardExample> {
}
