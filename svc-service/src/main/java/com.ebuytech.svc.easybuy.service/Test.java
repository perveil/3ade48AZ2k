package com.ebuytech.svc.easybuy.service;

import com.ebuytech.svc.easybuy.util.MD5Utils;
import com.ebuytech.svc.easybuy.util.RedisUtil;

import javax.annotation.Resource;

public class Test {

    public static void main(String[] args) {
        String admin = MD5Utils.getMD5(MD5Utils.getMD5(MD5Utils.getMD5("admin")));
        String root = MD5Utils.getMD5(MD5Utils.getMD5(MD5Utils.getMD5("root")));
        System.out.println(admin);
        System.out.println(root);
    }
}
