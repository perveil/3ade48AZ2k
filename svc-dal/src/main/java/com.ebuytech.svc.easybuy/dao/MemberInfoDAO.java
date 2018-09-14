package com.ebuytech.svc.easybuy.dao;

import com.ebuytech.svc.easybuy.entity.MemberInfo;
import com.ebuytech.svc.easybuy.entity.MemberInfoExample;
import org.springframework.stereotype.Repository;

/**
 * MemberInfoDAO继承基类
 */
@Repository public interface MemberInfoDAO extends MyBatisBaseDao<MemberInfo, String, MemberInfoExample> {
}
