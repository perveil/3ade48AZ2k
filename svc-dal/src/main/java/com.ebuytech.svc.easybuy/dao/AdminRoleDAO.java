package com.ebuytech.svc.easybuy.dao;

import com.ebuytech.svc.easybuy.entity.AdminRole;
import com.ebuytech.svc.easybuy.entity.AdminRoleExample;
import org.springframework.stereotype.Repository;

/**
 * AdminRoleDAO继承基类
 */
@Repository public interface AdminRoleDAO extends MyBatisBaseDao<AdminRole, Integer, AdminRoleExample> {
}
