package com.ebuytech.svc.easybuy.service;

import com.ebuytech.svc.easybuy.entity.Advert;
import com.ebuytech.svc.easybuy.entity.AdvertPos;

import java.util.List;

public interface IAdvertService {

    /**
     * 添加广告
     * @param posId 广告位id
     * @param advertName 广告名
     * @param validType 有效类型 0：永不过期 1：有期限
     * @param validTime 有效截止日期
     * @param imgurl 图片路径
     * @param notice 备注
     * @param status 状态 0：开启 1关闭 2：已结束
     * @return
     */
    int addAdvert(int posId, String advertName, int validType, String validTime, String imgurl, String notice, int status);

    /**
     * 查询广告列表
     * @param posId
     * @return
     */
    List<Advert> queryAdvertListByPage(int posId);

    /**
     * 查询广告位列表
     * @return
     */
    List<AdvertPos> queryAdvertPosList();

    /**
     * 根据名字查询广告
     * @param name
     * @return
     */
    List<Advert> queryAdvertByName(String name);
}
