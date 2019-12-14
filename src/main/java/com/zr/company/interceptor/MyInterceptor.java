package com.zr.company.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyInterceptor implements HandlerInterceptor {

    // 前置拦截器
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.err.println("执行前置拦截器");
        return true;
    }

    // 后置拦截器，controller执行后，页面跳转前
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.err.println("执行后置拦截器");
    }

    // 最后拦截器，controller执行后，页面跳转前
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.err.println("执行最终的拦截器");
    }

}
