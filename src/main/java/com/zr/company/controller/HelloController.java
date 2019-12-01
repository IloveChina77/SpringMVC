package com.zr.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        System.err.println("Hello Spring MVCjjj");
        return "success";
    }


}
