package com.ebuytech.svc.easybuy.service.impl;

import com.ebuytech.svc.easybuy.dao.StoreDAO;
import com.ebuytech.svc.easybuy.entity.Store;
import com.ebuytech.svc.easybuy.entity.StoreExample;
import com.ebuytech.svc.easybuy.service.IStoreService;
import com.ebuytech.svc.easybuy.util.UUIDUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Eric3 on 2018/9/17.
 */
@Service
@Transactional
@Slf4j
public class StoreServiceImpl implements IStoreService {

    @Resource
    StoreDAO storeDAO;

    @Override public Store addStore(Store store) {
        Store store1 = new Store();
        BeanUtils.copyProperties(store,store1);
        store1.setStoreId(UUIDUtils.getUUID());
        storeDAO.insert(store1);
        return store1;
    }

    @Override public String addStoreByExcel() {
        return null;
    }

    @Override public PageInfo<Store> queryStoreList(String storeName, String storeAddr) {
        StoreExample storeExample = new StoreExample();
        StoreExample.Criteria filter = storeExample.createCriteria();
        filter.andStoreNameLike("%" + storeName + "%");
        filter.andStoreAddrLike("%" + storeAddr + "%");
        PageHelper.startPage(0, 10);
        List<Store> storeList = storeDAO.selectByExample(storeExample);
        PageInfo<Store> pageInfo = new PageInfo<>(storeList);
        return pageInfo;
    }

    @Override public Store changeStatus(String storeId, Integer status) {
        StoreExample storeExample = new StoreExample();
        StoreExample.Criteria filter = storeExample.createCriteria();
        filter.andStoreIdEqualTo(storeId);
        List<Store> storeList = storeDAO.selectByExample(storeExample);
        Store store = storeList.get(0);
        if (status == 0){
            store.setStatus(1);
            storeDAO.updateByPrimaryKey(store);
        }
        if (status == 1){
            store.setStatus(0);
            storeDAO.updateByPrimaryKey(store);
        }
        return store;
    }


}

