package com.ebuytech.svc.easybuy.service;

import com.ebuytech.svc.easybuy.entity.Advert;
import com.ebuytech.svc.easybuy.entity.AdvertPos;

import java.util.List;

public interface IAdvertService {

    int addAdvert(String advertName, int validType, String validTime, String imgurl, String notice, int status);

    List<Advert> queryAdvertListByPage(int page);

    List<AdvertPos> queryAdvertPosList();

    List<Advert> queryAdvertByName(String name);
}
