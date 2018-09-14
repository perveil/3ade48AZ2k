package com.ebuytech.svc.easybuy.dao;

import com.ebuytech.svc.easybuy.entity.AdminUser;
import com.ebuytech.svc.easybuy.entity.AdminUserExample;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * AdminUserDAO继承基类
 */
@Repository
public interface AdminUserDAO extends MyBatisBaseDao<AdminUser, String, AdminUserExample> {
    AdminUser findByUserNameAndUserPwd(@Param("userName") String userName, @Param("userPwd") String userPwd);
        }