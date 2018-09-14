package com.ebuytech.svc.easybuy.dao;

import com.ebuytech.svc.easybuy.entity.AdminRoleAccess;
import com.ebuytech.svc.easybuy.entity.AdminRoleAccessExample;
import org.springframework.stereotype.Repository;

/**
 * AdminRoleAccessDAO继承基类
 */
@Repository public interface AdminRoleAccessDAO extends MyBatisBaseDao<AdminRoleAccess, Integer, AdminRoleAccessExample> {
}
