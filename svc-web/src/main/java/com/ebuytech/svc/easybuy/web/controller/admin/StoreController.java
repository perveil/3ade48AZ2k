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
    @ResponseBody
    Res<Store> addStore(Store store){
        return ResUtil.success(storeService.addStore(store));
    }

    @RequestMapping("/queryStoreList")
    @ResponseBody
    Res<Store> queryStoreList(){
        return ResUtil.success(storeService.queryStoreList());
    }
}
