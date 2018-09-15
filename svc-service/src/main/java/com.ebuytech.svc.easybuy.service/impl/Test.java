package com.ebuytech.svc.easybuy.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ebuytech.svc.easybuy.util.ResUtil;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> countMap = new HashMap<>();
        countMap.put("count1",1000);
        countMap.put("count2",1000);
        countMap.put("count3",1000);
        JSONObject jsonObject = JSON.parseObject(JSON.toJSONString(countMap));
        System.out.println(ResUtil.success(JSON.toJSONString(countMap)));
    }

}
