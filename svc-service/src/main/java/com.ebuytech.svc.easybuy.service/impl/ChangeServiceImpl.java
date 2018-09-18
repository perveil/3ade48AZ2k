package com.ebuytech.svc.easybuy.service.impl;

import com.ebuytech.svc.easybuy.dao.AccountChangeDAO;
import com.ebuytech.svc.easybuy.dao.AccountDAO;
import com.ebuytech.svc.easybuy.entity.Account;
import com.ebuytech.svc.easybuy.entity.AccountChange;
import com.ebuytech.svc.easybuy.entity.AccountChangeExample;
import com.ebuytech.svc.easybuy.entity.AccountExample;
import com.ebuytech.svc.easybuy.enums.ResultEnums;
import com.ebuytech.svc.easybuy.exception.AdminException;
import com.ebuytech.svc.easybuy.service.IChangeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Eric3 on 2018/9/15.
 */
@Service @Transactional @Slf4j public class ChangeServiceImpl implements IChangeService{
    @Resource
    AccountChangeDAO accountChangeDAO;

    @Resource
    AccountDAO accountDAO;

    @Override public PageInfo<AccountChange> queryChangeListByPage(int pageNum) {
        if (pageNum <= 0) {
            log.error("【查询交易记录】 页码不应小于0");
            throw new AdminException(ResultEnums.QUERY_PAGE_NOT_RIGHT);
        }
        AccountChangeExample accountChangeExample = new AccountChangeExample();
        AccountChangeExample.Criteria filter = accountChangeExample.createCriteria();
        filter.andAccountChangeIdIsNotNull();
        PageHelper.startPage(pageNum,10);
        List<AccountChange> accountChangeList = accountChangeDAO.selectByExample(accountChangeExample);
        PageInfo<AccountChange> pageInfo = new PageInfo<>(accountChangeList);
        return pageInfo;
    }

    @Override public PageInfo<AccountChange> queryChangeListByType(int pageNum, int type) {
        if (pageNum <= 0) {
            log.error("【查询交易记录】 页码不应小于0");
            throw new AdminException(ResultEnums.QUERY_PAGE_NOT_RIGHT);
        }
        AccountChangeExample accountChangeExample = new AccountChangeExample();
        AccountChangeExample.Criteria filter = accountChangeExample.createCriteria();
        filter.andAccountChangeIdIsNotNull();
        filter.andChangeTypeEqualTo(String.valueOf(type));
        PageHelper.startPage(pageNum,10);
        List<AccountChange> accountChangeList = accountChangeDAO.selectByExample(accountChangeExample);
        PageInfo<AccountChange> pageInfo = new PageInfo<>(accountChangeList);
        return pageInfo;
    }

    @Override public PageInfo<AccountChange> queryChangeListByTime(int pageNum, String time) {
        return queryChangeListByTimeScale(pageNum, time, time);
    }

    @Override public PageInfo<AccountChange> queryChangeListByTimeScale(int pageNum, String time1, String time2) {
        AccountChangeExample accountChangeExample = new AccountChangeExample();
        AccountChangeExample.Criteria filter = accountChangeExample.createCriteria();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        try {
            Date date = sdf.parse(time1+"000000");
            Date date1 = sdf.parse(time2+"235959");
            filter.andCreateTimeBetween(date,date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        PageHelper.startPage(pageNum, 10);
        List<AccountChange> accountChangeList = accountChangeDAO.selectByExample(accountChangeExample);
        PageInfo<AccountChange> pageInfo = new PageInfo<>(accountChangeList);
        return pageInfo;
    }

    @Override public PageInfo<AccountChange> queryChangeListByPhone(int pageNum, String phone) {
        AccountExample accountExample = new AccountExample();
        AccountExample.Criteria filter = accountExample.createCriteria();
        filter.andAccountNoEqualTo(phone);
        List<Account> accountList = accountDAO.selectByExample(accountExample);
        if (accountList.isEmpty()){
            log.error("【通过手机号查询】 手机号输入错误");
            throw new AdminException(ResultEnums.QUERY_PHONE_ERROR);
        }
        AccountChangeExample accountChangeExample = new AccountChangeExample();
        AccountChangeExample.Criteria filter1 = accountChangeExample.createCriteria();
        filter1.andAccountIdEqualTo(accountList.get(0).getAccountId());
        List<AccountChange> accountChangeList = accountChangeDAO.selectByExample(accountChangeExample);
        PageHelper.startPage(pageNum, 10);
        PageInfo<AccountChange> pageInfo = new PageInfo<>(accountChangeList);
        return pageInfo;
    }

    @Override public PageInfo<AccountChange> queryChangeListByValueCard(int pageNum, String cardId) {
        AccountChangeExample accountChangeExample = new AccountChangeExample();
        AccountChangeExample.Criteria filter = accountChangeExample.createCriteria();
        filter.andValueCardIdEqualTo(cardId);
        List<AccountChange> accountChangeList = accountChangeDAO.selectByExample(accountChangeExample);
        PageHelper.startPage(pageNum, 10);
        PageInfo<AccountChange> pageInfo = new PageInfo<>(accountChangeList);
        return pageInfo;
    }
}
