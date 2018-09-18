package com.ebuytech.svc.easybuy.service;

import com.ebuytech.svc.easybuy.entity.Store;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface IStoreService {

    /**
     * zty
     * @param store
     * @return
     */
    Store addStore(Store store);

    /**
     * zty
     * @return
     */
    PageInfo<Store> queryStoreList();

    Store queryStoreByStoreNameAndStoreAddress(String storeName, String storeAddress);

    Store updateStore();
}
