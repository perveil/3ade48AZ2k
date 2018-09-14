package com.ebuytech.svc.easybuy.service;

public interface ICardService {

    /**
     * 添加储值卡，并加入微信卡券
     *
     * @param openId
     * @return
     */
    boolean addValueCard(String openId);

}
