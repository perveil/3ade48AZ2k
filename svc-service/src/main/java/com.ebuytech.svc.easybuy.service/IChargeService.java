package com.ebuytech.svc.easybuy.service;

import com.ebuytech.svc.easybuy.entity.Charge;

import java.util.List;

public interface IChargeService {

    List<Charge> getChargeListByPage(int pageNum);

    boolean addCharge(int chargeMoney, int actId, int validType, String validTime);

}
