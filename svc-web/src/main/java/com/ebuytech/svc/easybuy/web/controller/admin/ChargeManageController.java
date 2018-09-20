package com.ebuytech.svc.easybuy.web.controller.admin;

import com.ebuytech.svc.easybuy.entity.Charge;
import com.ebuytech.svc.easybuy.service.IChargeService;
import com.ebuytech.svc.easybuy.util.Res;
import com.ebuytech.svc.easybuy.util.ResUtil;
import com.ebuytech.svc.easybuy.vo.PageVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HYS on 2018/9/15.
 */
@RestController
@RequestMapping("/charge")
@Slf4j
public class ChargeManageController {

    @Autowired
    private IChargeService chargeService;

    @PostMapping("/addCharge")
    public Res addCharge(int chargeMoney, int actId, int validType,
                         String validTime,@RequestParam(value = "chargeType",defaultValue = "0") int chargeType,
                         @RequestParam(value = "isValid",defaultValue = "0") int isValid){


         boolean flag = chargeService.addCharge(chargeMoney,actId,validType,validTime,chargeType,isValid);
         if (!flag)
             return ResUtil.error(1,"添加失败");
        return ResUtil.success();
    }

    @PostMapping("/queryChargeForm")
    public Res queryChargeForm(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                               @RequestParam(value = "size",defaultValue = "10")int size){

        pageNum = pageNum - 1;
        PageVO pageVO = chargeService.queryChargeListByPage(pageNum,size);
        if (pageVO == null){
            log.error("[查询charge]pageVO={},pageNum={}",pageVO,pageNum);
            return ResUtil.error(1,"查询错误");
        }

        return ResUtil.success().setData(pageVO);

    }

    @PostMapping("/queryChargeById")
    public Res queryChargeById(int chargeId){

        Charge charge = chargeService.queryChargeById(chargeId);
        if (charge == null)
            ResUtil.error(1,"查询id不存在");
        return ResUtil.success().setData(charge);
    }

    @PostMapping("/updateChargeStatus")
    public Res updateChargeStatus(int chargeId,int isValid){

        if (!chargeService.updateChargeisValidById(chargeId,isValid))
            return ResUtil.error(1,"修改错误没有查到charge");

        return ResUtil.success();
    }

    @PostMapping("/updateCharge")
    public Res updateCharge(int chargeId,int chargeMoney,int actId,int chargeType,int validType,String validTime,int ){
        if (charge == null)
            return ResUtil.error(1,"charge对象为空");
        if (!chargeService.updateCharge(charge))
            return ResUtil.error(1,"修改失败");

        return ResUtil.success();
    }




}
