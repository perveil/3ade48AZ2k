package com.ebuytech.svc.easybuy.service.impl;

import com.ebuytech.svc.easybuy.dao.AccountChangeDAO;
import com.ebuytech.svc.easybuy.dao.AccountDAO;
import com.ebuytech.svc.easybuy.entity.AccountChange;
import com.ebuytech.svc.easybuy.entity.AccountChangeExample;
import com.ebuytech.svc.easybuy.enums.ResultEnums;
import com.ebuytech.svc.easybuy.exception.AdminException;
import com.ebuytech.svc.easybuy.exception.ClientException;
import com.ebuytech.svc.easybuy.service.IChangeService;
import com.ebuytech.svc.easybuy.vo.*;
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

@Service @Transactional @Slf4j public class ChangeServiceImpl implements IChangeService {
    @Resource private AccountDAO accountDAO;

    @Resource private AccountChangeDAO accountChangeDAO;

    @Override public ChangeTransVO queryChangeListByPage(int pageNum , String timeType , String time, String type, String phone,
                                                         String valueCardId, String accountChangeId) {
        ChangeForm changeForm = new ChangeForm();
        if (pageNum <= 0) {
            log.error("【查询交易记录】 页码不应小于0");
            throw new AdminException(ResultEnums.QUERY_PAGE_NOT_RIGHT);
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        if (timeType.equals("1")){
            try {
                Date startTime = sdf.parse(time+"000000");
                Date endTime = sdf.parse(time+"235959");
                changeForm.setStartTime(startTime);
                changeForm.setEndTime(endTime);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }if (timeType.equals("2")) {
            String[] sArr = time.split("[-]");
            String s1 = sArr[0];
            String s2 = sArr[1];
            try {
                Date startTime = sdf.parse(s1 + "000000");
                Date endTime = sdf.parse(s2 + "235959");
                changeForm.setStartTime(startTime);
                changeForm.setEndTime(endTime);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }if (timeType.equals("")){
            Date startTime = null;
            Date endTime = null;
            changeForm.setStartTime(startTime);
            changeForm.setEndTime(endTime);
        }
        changeForm.setPhone(phone);
        changeForm.setAccountChangeId(accountChangeId);
        changeForm.setTimeType(timeType);
        changeForm.setType(type);
        changeForm.setValueCardId(valueCardId);
        ChangeTransVO changeTransVO = new ChangeTransVO();

        PageHelper.startPage(pageNum, 10);
        List<ChangeTransDTO> changeTransDTOList = accountChangeDAO.queryChangeListByPage(changeForm);
        PageInfo pageInfo = new PageInfo(changeTransDTOList);
        changeTransVO.setChangeTransList(changeTransDTOList);
        changeTransVO.setTotalPage(pageInfo.getPages());
        changeTransVO.setTotalResult(pageInfo.getTotal());
        return changeTransVO;
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

    @Override public PageInfo<AccountChange> queryChangeListByTimeScale(int pageNum, String time1, String time2) {
        AccountChangeExample accountChangeExample = new AccountChangeExample();
        AccountChangeExample.Criteria filter = accountChangeExample.createCriteria();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        try {
            Date date = sdf.parse(time1 + "000000");
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

    @Override public PageInfo<AccountChange> queryChangeListByCard(int pageNum, String cardId) {
        AccountChangeExample accountChangeExample = new AccountChangeExample();
        AccountChangeExample.Criteria filter = accountChangeExample.createCriteria();
        filter.andValueCardIdEqualTo(cardId);
        List<AccountChange> accountChangeList = accountChangeDAO.selectByExample(accountChangeExample);
        PageHelper.startPage(pageNum, 10);
        PageInfo<AccountChange> pageInfo = new PageInfo<>(accountChangeList);
        return pageInfo;
    }
}
