package com.ebuytech.svc.easybuy.web.controller.client;

import com.ebuytech.svc.easybuy.service.IAccountService;
import com.ebuytech.svc.easybuy.service.ICardService;
import com.ebuytech.svc.easybuy.service.IChangeService;
import com.ebuytech.svc.easybuy.service.IMemberService;
import com.ebuytech.svc.easybuy.util.Res;
import com.ebuytech.svc.easybuy.util.ResUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController @RequestMapping("client") public class UserController {

    @Resource private IAccountService accountService;

    @Resource private IMemberService memberService;

    @Resource private ICardService cardService;

    @Resource private IChangeService changeService;

    @PostMapping("user/login") public Res login(String code) {
        return ResUtil.success(accountService.login(code));
    }

    @PostMapping("user/registerMember") public Res registerMember(String openId, String memberName, String sex, String sessionCode, String encryptedData, String iv) {
        return ResUtil.success(memberService.addMember(openId, memberName, sex, sessionCode, encryptedData, iv));
    }

    @PostMapping("user/addStoredCard") public Res addStoredCard(String openId) {
        return ResUtil.success(cardService.addValueCard(openId));
    }

    @PostMapping("user/queryBill") public Res queryBill(@RequestParam(name = "pageNum", defaultValue = "1") Integer pageNum, String accountId) {
        return ResUtil.success(changeService.queryChangeListByValueCard(pageNum, accountId));
    }

    @PostMapping("user/queryBillByType") public Res queryBill(@RequestParam(name = "pageNum", defaultValue = "1") Integer pageNum, Integer type, String openId) {
        return ResUtil.success(changeService.queryChangeListByType(pageNum, type, openId));
    }

}
