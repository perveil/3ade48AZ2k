package com.ebuytech.svc.easybuy.web.controller.admin;

import com.ebuytech.svc.easybuy.entity.Store;
import com.ebuytech.svc.easybuy.service.IStoreService;
import com.ebuytech.svc.easybuy.util.Res;
import com.ebuytech.svc.easybuy.util.ResUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Eric3 on 2018/9/17.
 */
@RestController
@RequestMapping("/store")
public class StoreController {

    @Autowired
    IStoreService storeService;

    @RequestMapping("/addStore")
    @ResponseBody Res addStore(Store store){
        storeService.addStore(store);
        return ResUtil.success();
    }

    @RequestMapping("/queryStoreList")
    @ResponseBody
    Res<Store> queryStoreList(String storeName, String storeAddr){
        return ResUtil.success(storeService.queryStoreList(storeName, storeAddr));
    }

    @RequestMapping("/changeStatus")
    @ResponseBody
    Res changeStatus(String storeId, Integer status){
        return ResUtil.success(storeService.changeStatus(storeId, status));
    }
}
