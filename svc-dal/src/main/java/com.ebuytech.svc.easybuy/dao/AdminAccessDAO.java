package com.ebuytech.svc.easybuy.dao;

import com.ebuytech.svc.easybuy.entity.AdminAccess;
import com.ebuytech.svc.easybuy.entity.AdminAccessExample;
import org.springframework.stereotype.Repository;

/**
 * AdminAccessDAO继承基类
 */
@Repository public interface AdminAccessDAO extends MyBatisBaseDao<AdminAccess, Integer, AdminAccessExample> {
}
