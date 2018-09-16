package com.ebuytech.svc.easybuy.service;


import com.ebuytech.svc.easybuy.util.RedisUtil;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test {


    public static void main(String[] args) {

        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        String time = format.format(Calendar.getInstance().getTime())+ Calendar.getInstance().get(Calendar.WEEK_OF_YEAR);
    }
}
