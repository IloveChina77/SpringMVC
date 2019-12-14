package com.zr.company.interceptor.config;

import com.zr.company.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyInterceptorConfigBean implements WebMvcConfigurer {

    /*
        1、实现WebMvcConfigurer
        2、override addInterceptors 方法
        3、注册自己的拦截器，并说明拦截哪些方法
        4、最后在SpringMVC.xml中配置
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
    }
}
