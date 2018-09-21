package com.ebuytech.svc.easybuy.service;

import com.ebuytech.svc.easybuy.entity.Store;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface IStoreService {

    /**
     * lzy
     * @param store
     * @return
     */
    void addStore(Store store);

    /**
     * lzy
     * 通过excel文件导入门店记录
     * @return
     */
    String addStoreByExcel();

    /**
     * zty
     * 根据关键词查找门店
     * @param storeName
     * @param storeAddr
     * @return
     */
    PageInfo<Store> queryStoreList(String storeName, String storeAddr);

    Store changeStatus(String storeId, Integer status);

}
