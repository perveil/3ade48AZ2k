package com.ebuytech.svc.easybuy.dao;

import com.ebuytech.svc.easybuy.dto.*;
import com.ebuytech.svc.easybuy.entity.AccountCharge;
import com.ebuytech.svc.easybuy.entity.AccountChargeExample;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * AccountChargeDAO继承基类
 */
@Repository
public interface AccountChargeDAO extends MyBatisBaseDao<AccountCharge, String, AccountChargeExample> {
    List<Daily>  getDaily();
    List<Monthly> getMonthly();
    List<Weekly> getWeekly();
    List<DailyT>  getDailyT();
    List<MonthlyT> getMonthlyT();
    List<WeeklyT> getWeeklyT();
}