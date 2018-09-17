package com.ebuytech.svc.easybuy.web.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration public class ClientConfiguration implements WebMvcConfigurer {
        @Autowired private ClientInterceptor clientInterceptor;

        @Override public void addInterceptors(InterceptorRegistry registry){
            registry.addInterceptor(clientInterceptor).addPathPatterns("/client/user/*").excludePathPatterns("/client/user/login");
        }
}
