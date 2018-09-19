package com.ebuytech.svc.easybuy.dao;

import com.ebuytech.svc.easybuy.entity.GiftCardCover;
import com.ebuytech.svc.easybuy.entity.GiftCardCoverExample;
import org.springframework.stereotype.Repository;

/**
 * GiftCardCoverDAO继承基类
 */
@Repository
public interface GiftCardCoverDAO extends MyBatisBaseDao<GiftCardCover, Integer, GiftCardCoverExample> {
}