package com.zr.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;


@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(String username, String password, Date date) {
        System.err.println("Hello Spring MVC");
        System.err.println(username+password+date);
        return "success";
    }




}
