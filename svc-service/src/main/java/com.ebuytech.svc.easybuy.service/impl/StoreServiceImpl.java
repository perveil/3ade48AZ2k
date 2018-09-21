package com.ebuytech.svc.easybuy.service.impl;

import cn.binarywang.wx.miniapp.api.WxMaService;
import com.ebuytech.svc.easybuy.entity.Store;
import com.ebuytech.svc.easybuy.service.IStoreService;
import com.ebuytech.svc.easybuy.util.UUIDUtils;
import com.github.pagehelper.PageInfo;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.store.WxMpStoreBaseInfo;
import me.chanjar.weixin.mp.bean.store.WxMpStoreInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class StoreServiceImpl implements IStoreService {

    //公众号service
    @Resource private WxMpService wxMpService;

    @Override public void addStore(Store store) {
        //生成自主sid
        String sid = UUIDUtils.getUUID();
        //添加门店后wx实时返回poi_id
        WxMpStoreBaseInfo wxMpStoreBaseInfo = new WxMpStoreBaseInfo(sid,store.getStoreName())
        //插入数据库
        //
        wxMpService.
    }

    @Override public String addStoreByExcel() {
        return null;
    }

    @Override public PageInfo<Store> queryStoreList(String storeName, String storeAddr) {
        return null;
    }

    @Override public Store changeStatus(String storeId, Integer status) {
        return null;
    }
}
