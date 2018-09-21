package com.ebuytech.svc.easybuy.service.impl;

import com.alibaba.druid.sql.visitor.functions.Char;
import com.ebuytech.svc.easybuy.dao.ActivityDAO;
import com.ebuytech.svc.easybuy.dao.ChargeCDAO;
import com.ebuytech.svc.easybuy.dao.ChargeDAO;
import com.ebuytech.svc.easybuy.entity.Activity;
import com.ebuytech.svc.easybuy.entity.Charge;
import com.ebuytech.svc.easybuy.entity.ChargeExample;
import com.ebuytech.svc.easybuy.service.IChargeService;
import com.ebuytech.svc.easybuy.vo.ChargeVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by HYS on 2018/9/15.
 */
@Service @Slf4j public class ChargeServiceImpl implements IChargeService {

    @Autowired private ChargeDAO chargeDAO;

    @Autowired private ChargeCDAO chargeCDAO;

    @Autowired private ActivityDAO activityDAO;

    @Override public boolean addCharge(int chargeMoney, int actId, int validType, String validTime,int chargeType,int isValid) {

        Charge charge = new Charge();
        charge.setActId(actId);
        charge.setChargeMoney(chargeMoney);
        charge.setValidType(validType);
        charge.setValidTime(validTime);
        charge.setChargeType(chargeType);
        charge.setIsValid(isValid);
        return chargeDAO.insert(charge) > 0;
    }

    @Override public Charge queryChargeById(int chargeId) {

        return chargeDAO.selectByPrimaryKey(chargeId);
    }


    @Override public boolean updateChargeisValidById(int chargeId, int isValid) {

        return chargeCDAO.updateChargeIsValidById(chargeId,isValid) > 0;
    }

    @Override public boolean updateCharge(Charge charge) {

        return chargeDAO.updateByPrimaryKeySelective(charge) > 0;
    }

    @Override public PageInfo<Charge> queryChargeListByPage(int pageNum, int size) {
        ChargeExample chargeExample = new ChargeExample();
        ChargeExample.Criteria criteria = chargeExample.createCriteria();
        criteria.andChargeIdIsNotNull();
        PageHelper.startPage(pageNum, size);

        List<Charge> chargeList = chargeDAO.selectByExample(chargeExample);
        return new PageInfo<>(chargeList);
    }

}
