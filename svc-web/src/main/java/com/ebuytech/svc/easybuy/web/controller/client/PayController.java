package com.ebuytech.svc.easybuy.web.controller.client;

import com.ebuytech.svc.easybuy.enums.ResultEnums;
import com.ebuytech.svc.easybuy.exception.ClientException;
import com.ebuytech.svc.easybuy.service.IChargeService;
import com.ebuytech.svc.easybuy.util.Res;
import com.ebuytech.svc.easybuy.util.ResUtil;
import com.ebuytech.svc.easybuy.util.WXPayUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController @RequestMapping("client") public class PayController {

    @Resource IChargeService chargeService;

    @PostMapping("pay/unified") public Res unified(String body, Integer totalFee,String accountId) {
        return ResUtil.success(chargeService.unifiedOrder(body,totalFee,accountId));
    }

    @GetMapping("payConfirm") public Res payConfirm(HttpServletRequest request) {
        return ResUtil.success(chargeService.payConfirm(request));
    }
}
