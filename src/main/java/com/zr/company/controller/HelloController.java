package com.zr.company.controller;

import com.zr.company.pojo.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;


@Controller
@SessionAttributes(value = {"msg"})
public class HelloController {

    @RequestMapping("/hello")
    public String hello(String username, String password, Date date) {
        System.err.println("Hello Spring MVC");
        System.err.println(username+password+date);
        return "success";
    }

    @RequestMapping("/modelAttribute")
    public String modelAttribute(UserBean userBean){
        System.err.println(userBean.toString());
        return "success";
    }

    @RequestMapping("/modelAttribute1")
    public String modelAttribute1(@ModelAttribute("md1") UserBean userBean){
        System.err.println(userBean.toString());
        return "success";
    }
    @ModelAttribute
    public void nothing3(Map<String, UserBean> map, String username) {
        UserBean u = new UserBean();
        u.setUsername("abcdefg");// 这边你设置了也是使用前端传来的，除非前台没有传
        u.setPassword("123");
        u.setDate(new Date());
        map.put("md1", u);
    }

    @ModelAttribute
    public UserBean nothing(String username) {
        UserBean u = new UserBean();
        u.setUsername("abcdefg");// 这边你设置了也是使用前端传来的，除非前台没有传
        u.setPassword("123");
        u.setDate(new Date());
        System.err.println("let's go0!");
        return u;
    }
    @ModelAttribute
    public UserBean nothing1(String username) {
        UserBean u = new UserBean();
        u.setUsername("abcdefg");// 这边你设置了也是使用前端传来的，除非前台没有传
        u.setPassword("123");
        u.setDate(new Date());
        System.err.println("let's go1!");
        return u;
    }
    @ModelAttribute
    public UserBean nothing2(String username) {
        UserBean u = new UserBean();
        u.setUsername("abcdefg");// 这边你设置了也是使用前端传来的，除非前台没有传
        u.setPassword("123");
        u.setDate(new Date());
        System.err.println("let's go2!");
        return u;
    }

    @RequestMapping("/testSessionAttributions")
    public String testSessionAttributions(Model model) {
        model.addAttribute("msg","你最棒！");
        return "success";
    }
    @RequestMapping("/testGetSessionAttributions")
    public String testGetSessionAttributions(ModelMap modelMap) {
        System.err.println(modelMap.getAttribute("msg"));
        return "success";
    }
    @RequestMapping("/testDelSessionAttributions")
    public String testDelSessionAttributions(SessionStatus sessionStatus) {
        sessionStatus.setComplete();
        return "success";
    }






}
