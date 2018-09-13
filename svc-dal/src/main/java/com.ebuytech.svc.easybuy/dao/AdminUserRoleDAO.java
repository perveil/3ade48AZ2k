package com.ebuytech.svc.easybuy.dao;

import com.ebuytech.svc.easybuy.entity.AdminUserRole;
import com.ebuytech.svc.easybuy.entity.AdminUserRoleExample;
import org.springframework.stereotype.Repository;

/**
 * AdminUserRoleDAO继承基类
 */
@Repository
public interface AdminUserRoleDAO extends MyBatisBaseDao<AdminUserRole, String, AdminUserRoleExample> {
}