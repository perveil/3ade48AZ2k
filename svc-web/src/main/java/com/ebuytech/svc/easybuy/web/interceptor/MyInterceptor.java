package com.ebuytech.svc.easybuy.web.interceptor;

import com.ebuytech.svc.easybuy.entity.AdminUser;
import com.ebuytech.svc.easybuy.service.IAdminService;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Eric3 on 2018/9/13.
 */

public class MyInterceptor implements HandlerInterceptor {

    @Autowired private IAdminService adminUserService;

    @Override public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //去Redis里查询
        String token = request.getParameter("token");
        return adminUserService.checkToken(request.getParameter("userId"), token);
    }
}
