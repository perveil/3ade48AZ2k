package com.ebuytech.svc.easybuy.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by HYS on 2018/9/16.
 */
public interface IGiftService {


    boolean uploadIcon(MultipartFile file,String path);

    //创建礼品卡
    boolean createGift(String accountId,String memberId,String valueCardId,int money,String endTime,int status,String imgUrl);
}
