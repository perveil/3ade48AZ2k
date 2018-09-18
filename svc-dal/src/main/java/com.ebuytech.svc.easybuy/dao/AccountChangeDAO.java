package com.ebuytech.svc.easybuy.dao;

import com.ebuytech.svc.easybuy.entity.AccountChange;
import com.ebuytech.svc.easybuy.entity.AccountChangeExample;
import com.ebuytech.svc.easybuy.vo.AccountChangeDetailVO;
import com.ebuytech.svc.easybuy.vo.AccountChangeVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * AccountChangeDAO继承基类
 */
@Repository public interface AccountChangeDAO extends MyBatisBaseDao<AccountChange, String, AccountChangeExample> {
     AccountChangeDetailVO queryAccountChangeDetail(String accountChangeId);
}
