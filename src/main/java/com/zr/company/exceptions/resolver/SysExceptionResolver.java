package com.zr.company.exceptions.resolver;


import com.zr.company.exceptions.SysException;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class SysExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        SysException s = null;
        if(ex instanceof SysException) {
            s = (SysException)ex;
        } else {
            s = new SysException("系统维护~~~~");
        }
        // 创建moduleAndView
        ModelAndView mv = new ModelAndView();
        // 向moduleAndView 放数据（最后还是放到request域中去）
        mv.addObject("errorMsg",s.getMsg());
        // 设置跳转页面
        mv.setViewName("error");
        return mv;
    }
}
