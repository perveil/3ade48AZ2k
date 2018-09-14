package com.ebuytech.svc.easybuy.service;


import com.ebuytech.svc.easybuy.util.RedisUtil;

import javax.annotation.Resource;

public class Test {


    public static void main(String[] args) {

       RedisUtil redisUtil = new RedisUtil();
        System.out.println(redisUtil.get("59a73d38abdd29b0f3f64f1b855f73eb"));
    }
}
