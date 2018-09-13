package com.ebuytech.svc.easybuy.dao;

import com.ebuytech.svc.easybuy.entity.MemberSource;
import com.ebuytech.svc.easybuy.entity.MemberSourceExample;
import org.springframework.stereotype.Repository;

/**
 * MemberSourceDAO继承基类
 */
@Repository
public interface MemberSourceDAO extends MyBatisBaseDao<MemberSource, String, MemberSourceExample> {
}