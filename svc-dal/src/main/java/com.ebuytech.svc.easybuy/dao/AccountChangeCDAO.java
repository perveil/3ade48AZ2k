package com.ebuytech.svc.easybuy.dao;

import com.ebuytech.svc.easybuy.entity.AccountChange;
import com.ebuytech.svc.easybuy.entity.AccountChangeExample;
import com.ebuytech.svc.easybuy.vo.AccountChangeDetailVO;
import com.ebuytech.svc.easybuy.vo.ChangeForm;
import com.ebuytech.svc.easybuy.vo.ChangeTransDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository public interface AccountChangeCDAO extends MyBatisBaseDao<AccountChange, String, AccountChangeExample> {
    AccountChangeDetailVO queryAccountChangeDetail(String accountChangeId);

    List<ChangeTransDTO> queryChangeListByPage(ChangeForm changeForm);
}
