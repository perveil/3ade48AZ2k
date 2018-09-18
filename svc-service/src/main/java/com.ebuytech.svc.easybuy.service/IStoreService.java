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
     * 通过excel文件导入门店记录
     * @return
     */
    String addStoreByExcel();

    /**
     * zty
     * 查询门店列表
     * @return
     */
    List<Store> queryStoreList();

    /**
     * zty
     * 根据关键词查找门店
     * @param storeName
     * @param storeAddr
     * @return
     */
    List<Store> queryStoreListByKeyword(String storeName, String storeAddr);
}
