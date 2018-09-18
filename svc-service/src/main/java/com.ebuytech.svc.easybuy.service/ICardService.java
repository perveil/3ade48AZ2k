package com.ebuytech.svc.easybuy.service;

import com.ebuytech.svc.easybuy.entity.GiftCard;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

public interface ICardService {

    /**
     * 添加储值卡，并加入微信卡券
     *
     * @param openId
     * @return
     */
    boolean addValueCard(String openId);

    /**
     * 查询礼品卡
     * @param page
     * @return
     */
    PageInfo<GiftCard> queryGiftCardListByPage(int page);
}
