package com.ebuytech.svc.easybuy.service.impl;

import com.ebuytech.svc.easybuy.dao.AccountChangeDAO;
import com.ebuytech.svc.easybuy.entity.Account;
import com.ebuytech.svc.easybuy.entity.AccountChange;
import com.ebuytech.svc.easybuy.service.IChangeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Eric3 on 2018/9/15.
 */
@Service @Transactional @Slf4j public class ChangeServiceImpl implements IChangeService{
    @Resource
    AccountChangeDAO accountChangeDAO;

    @Resource Account account;

    @Override public List<AccountChange> queryChangeListByPage(int pageNum) {

        return null;
    }

    @Override public List<AccountChange> queryChangeListByType(int pageNum, int type) {
        return null;
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

    @Override public List<AccountChange> queryChangeListByValueCard(int pageNum, String cardId) {
        return null;
    }
}
