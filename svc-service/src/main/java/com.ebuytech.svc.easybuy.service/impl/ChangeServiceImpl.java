package com.ebuytech.svc.easybuy.service.impl;

import com.ebuytech.svc.easybuy.dao.AccountChangeDAO;
import com.ebuytech.svc.easybuy.entity.Account;
import com.ebuytech.svc.easybuy.entity.AccountChange;
import com.ebuytech.svc.easybuy.entity.AccountChangeExample;
import com.ebuytech.svc.easybuy.enums.ResultEnums;
import com.ebuytech.svc.easybuy.exception.AdminException;
import com.ebuytech.svc.easybuy.service.IChangeService;
import com.ebuytech.svc.easybuy.vo.AccountVO;
import com.ebuytech.svc.easybuy.vo.ChangeVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eric3 on 2018/9/15.
 */
@Service @Transactional @Slf4j public class ChangeServiceImpl implements IChangeService{
    @Resource
    AccountChangeDAO accountChangeDAO;

    @Override public ChangeVO queryChangeListByPage(int pageNum) {
        ChangeVO changeVO = new ChangeVO();
        AccountChangeExample accountChangeExample = new AccountChangeExample();
        AccountChangeExample.Criteria filter = accountChangeExample.createCriteria();
        filter.andAccountChangeIdIsNotNull();
        PageHelper.startPage(pageNum,10);
        List<AccountChange> accountChangeList = accountChangeDAO.selectByExample(accountChangeExample);
        PageInfo pageInfo = new PageInfo(accountChangeList);
        changeVO.setChangeList(accountChangeList);
        changeVO.setTotalPage(pageInfo.getPages());
        changeVO.setTotalResult(pageInfo.getTotal());
        if (pageNum <= 0) {
            log.error("【查询交易记录】 页码不应小于0");
            throw new AdminException(ResultEnums.QUERY_PAGE_NOT_RIGHT);
        }
        return changeVO;
    }

    @Override public ChangeVO queryChangeListByType(int pageNum, int type) {
        ChangeVO changeVO = new ChangeVO();
        AccountChangeExample accountChangeExample = new AccountChangeExample();
        AccountChangeExample.Criteria filter = accountChangeExample.createCriteria();
        //TODO
        //filter.andChangeTypeEqualTo(type);
        return null;
    }

    @Override public ChangeVO queryChangeListByTime(int pageNum, String time) {
        ChangeVO changeVO = new ChangeVO();
        AccountChangeExample accountChangeExample = new AccountChangeExample();
        AccountChangeExample.Criteria filter = accountChangeExample.createCriteria();
        //if (!StringUtils.isEmpty(time))
        //TODO    filter.andTime
        return null;
    }

    @Override public List<AccountChange> queryChangeListByTimeScale(int pageNum, String time1, String time2) {
        return null;
    }

    @Override public List<AccountChange> queryChangeListByPhone(int pageNum, String phone) {

        return null;
    }

    @Override public List<AccountChange> queryChangeListByValueCard(int pageNum, String cardId) {
        return null;
    }
}
