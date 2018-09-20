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
