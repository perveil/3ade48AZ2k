package com.ebuytech.svc.easybuy.service.impl;

import com.ebuytech.svc.easybuy.dao.AccountChangeDAO;
import com.ebuytech.svc.easybuy.dao.AccountDAO;
import com.ebuytech.svc.easybuy.entity.Account;
import com.ebuytech.svc.easybuy.entity.AccountChange;
import com.ebuytech.svc.easybuy.entity.AccountChangeExample;
import com.ebuytech.svc.easybuy.entity.AccountExample;
import com.ebuytech.svc.easybuy.enums.ResultEnums;
import com.ebuytech.svc.easybuy.exception.ClientException;
import com.ebuytech.svc.easybuy.service.IChangeService;
import com.ebuytech.svc.easybuy.vo.AccountChangeDetailVO;
import com.ebuytech.svc.easybuy.vo.AccountChangeVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service @Transactional public class ChangeServiceImpl implements IChangeService {
    @Resource private AccountDAO accountDAO;

    @Resource private AccountChangeDAO accountChangeDAO;

    @Override public List<AccountChange> queryChangeListByPage(int pageNum) {
        return null;
    }

    @Override public AccountChangeVO queryChangeListByType(int pageNum, int type, String accountId) {

        PageHelper.startPage(pageNum, 10);
        AccountChangeExample accountChangeExample = new AccountChangeExample();
        accountChangeExample.createCriteria().andAccountIdEqualTo(accountId).andChangeTypeEqualTo(String.valueOf(type));

        List<AccountChange> accountChangeList = accountChangeDAO.selectByExample(accountChangeExample);

        PageInfo pageInfo = new PageInfo(accountChangeList);
        AccountChangeVO accountChangeVO = new AccountChangeVO();
        accountChangeVO.setAccountChangeList(accountChangeList);
        accountChangeVO.setTotalPage(pageInfo.getPages());
        accountChangeVO.setTotalResult(pageInfo.getTotal());
        if (pageNum > pageInfo.getPages()) {
            throw new ClientException(ResultEnums.PAGENUM_ERROR);
        }
        return accountChangeVO;
    }

    @Override public AccountChangeDetailVO queryChangeDetail(String accountChangeId) {
        return accountChangeDAO.queryAccountChangeDetail(accountChangeId);
    }

    @Override public List<AccountChange> queryChangeListByTime(int pageNum, String time) {
        return null;
    }

    @Override public List<AccountChange> queryChangeListByTimeScale(int pageNum, String time1, String time2) {
        return null;
    }

    @Override public List<AccountChange> queryChangeListByPhone(int pageNum, String phone) {
        return null;
    }

    @Override public AccountChangeVO queryChangeListByValueCard(int pageNum, String accountId) {
        PageHelper.startPage(pageNum, 10);

        AccountChangeExample accountChangeExample = new AccountChangeExample();
        accountChangeExample.createCriteria().andAccountIdEqualTo(accountId);
        List<AccountChange> accountChangeList = accountChangeDAO.selectByExample(accountChangeExample);
        for (AccountChange o : accountChangeList) {
            o.setBalance(null);
        }
        PageInfo pageInfo = new PageInfo(accountChangeList);
        AccountChangeVO accountChangeVO = new AccountChangeVO();
        accountChangeVO.setAccountChangeList(accountChangeList);
        accountChangeVO.setTotalPage(pageInfo.getPages());
        accountChangeVO.setTotalResult(pageInfo.getTotal());
        if (pageNum > pageInfo.getPages()) {
            throw new ClientException(ResultEnums.PAGENUM_ERROR);
        }
        return accountChangeVO;
    }
}
