package com.ebuytech.svc.easybuy.web.interceptor;

import com.ebuytech.svc.easybuy.enums.ResultEnums;
import com.ebuytech.svc.easybuy.exception.ClientException;
import com.ebuytech.svc.easybuy.service.IAccountService;
import com.ebuytech.svc.easybuy.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component public class ClientInterceptor implements HandlerInterceptor {
    @Autowired private IAccountService accountService;

    @Override public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(request.getParameter("sessionCode")==null){
            throw new ClientException(ResultEnums.REQUIRE_SESSIONCODE);
        }
        return accountService.checkSessionCode(request.getParameter("sessionCode"));
    }
}
