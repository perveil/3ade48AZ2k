package com.ebuytech.svc.easybuy.web.controller.admin;

import com.ebuytech.svc.easybuy.service.IMemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("test")
public class IndexController {

    @Resource
    private IMemberService memberService;

    @GetMapping("/hello")
    public String hello(){

        if (memberService.addMember("1", "airmacx", "男", "13601992766")){
            return "hello";
        }
        return "failed";
    }

}
