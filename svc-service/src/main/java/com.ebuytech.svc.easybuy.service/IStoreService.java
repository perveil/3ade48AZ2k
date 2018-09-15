package com.ebuytech.svc.easybuy.service;

import com.ebuytech.svc.easybuy.entity.Store;

import java.util.List;

public interface IStoreService {

    /**
     * zty
     * @param store
     * @return
     */
    String addStore(Store store);

    /**
     * zty
     * @return
     */
    List<Store> queryStoreList();
}
