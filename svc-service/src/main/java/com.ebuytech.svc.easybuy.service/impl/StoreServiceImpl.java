package com.ebuytech.svc.easybuy.service.impl;

import cn.binarywang.wx.miniapp.api.WxMaService;
import com.ebuytech.svc.easybuy.entity.Store;
import com.ebuytech.svc.easybuy.service.IStoreService;

import javax.annotation.Resource;
import java.util.List;

public class StoreServiceImpl implements IStoreService {

    @Resource WxMaService wxMaService;

    @Override public String addStore(Store store) {

        return null;
    }

    @Override public String addStoreByExcel() {
        return null;
    }

    @Override public List<Store> queryStoreList() {
        return null;
    }

    @Override public List<Store> queryStoreListByKeyword(String storeName, String storeAddr) {
        return null;
    }
}
