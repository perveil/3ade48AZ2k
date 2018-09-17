package com.ebuytech.svc.easybuy.service.impl;

import com.ebuytech.svc.easybuy.entity.Store;
import com.ebuytech.svc.easybuy.service.IStoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Eric3 on 2018/9/17.
 */
@Service
@Transactional
@Slf4j
public class StoreServiceImpl implements IStoreService {

    @Override public String addStore(Store store) {

        return null;
    }

    @Override public List<Store> queryStoreList() {
        return null;
    }
}
