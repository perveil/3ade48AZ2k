package com.ebuytech.svc.easybuy.util;

import javax.annotation.Resource;
import java.util.Random;

public class TradeNoUtil {

    public static String getTradeNo(int num) {
        String randomId = "";
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            Integer randNum = random.nextInt(10);
            randomId += randNum.toString();
        }
        return randomId;
    }

    public static String getRandomNo(int num) {
        String randomId = "";
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            Integer randomNum = random.nextInt(10);
            randomId += randomNum.toString();
        }
        return randomId;
    }
}
