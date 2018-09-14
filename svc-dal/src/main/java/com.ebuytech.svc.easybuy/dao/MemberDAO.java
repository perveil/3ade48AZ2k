package com.ebuytech.svc.easybuy.dao;

import com.ebuytech.svc.easybuy.entity.Member;
import com.ebuytech.svc.easybuy.entity.MemberExample;
import org.springframework.stereotype.Repository;

/**
 * MemberDAO继承基类
 */
@Repository public interface MemberDAO extends MyBatisBaseDao<Member, String, MemberExample> {
}
