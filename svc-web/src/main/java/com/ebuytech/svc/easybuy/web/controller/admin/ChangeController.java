package com.ebuytech.svc.easybuy.web.controller.admin;

import com.ebuytech.svc.easybuy.service.IChangeService;
import com.ebuytech.svc.easybuy.util.Res;
import com.ebuytech.svc.easybuy.util.ResUtil;
import com.ebuytech.svc.easybuy.vo.ChangeForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Eric3 on 2018/9/15.
 */
@RestController @RequestMapping("/change") public class ChangeController {

    @Autowired IChangeService changeService;


    @RequestMapping("/queryChangeListByPage")
    @ResponseBody
    Res queryChangeListByPage(int pageNum , String timeType , String time, String type, String phone,
                              String valueCardId, String accountChangeId) {
        return ResUtil.success(changeService.queryChangeListByPage(pageNum, timeType, time, type, phone, valueCardId, accountChangeId));
    }

    /*@RequestMapping("/queryChangeListByType")
    @ResponseBody
    Res queryChangeListByType(int pageNum, int type){
        return ResUtil.success(changeService.queryChangeListByType(pageNum, type));
    }*/

    @RequestMapping("/queryChangeListByTime")
    @ResponseBody
    Res queryChangeListByTime(int pageNum, String time){
        return ResUtil.success(changeService.queryChangeListByTime(pageNum, time));
    }

    @RequestMapping("/queryChangeListByTimeScale")
    @ResponseBody
    Res queryChangeListByTimeScale(int pageNum, String time1, String time2){
        return ResUtil.success(changeService.queryChangeListByTimeScale(pageNum, time1, time2));
    }

    @RequestMapping("/queryChangeListByPhone")
    @ResponseBody
    Res queryChangeListByPhone(int pageNum, String phone){
        return  ResUtil.success(changeService.queryChangeListByPhone(pageNum, phone));
    }

    @RequestMapping("/queryChangeListByValueCard")
    @ResponseBody
    Res queryChangeListByValueCard(int pageNum, String cardId){
        return ResUtil.success(changeService.queryChangeListByValueCard(pageNum, cardId));
    }
}
