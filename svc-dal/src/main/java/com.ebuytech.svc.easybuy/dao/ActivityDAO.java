package com.ebuytech.svc.easybuy.dao;

import com.ebuytech.svc.easybuy.entity.Activity;
import com.ebuytech.svc.easybuy.entity.ActivityExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * ActivityDAO继承基类
 */
@Repository public interface ActivityDAO extends MyBatisBaseDao<Activity, Integer, ActivityExample> {

    int updateStatus(@Param("actId") int actId,@Param("status") int status);
}
