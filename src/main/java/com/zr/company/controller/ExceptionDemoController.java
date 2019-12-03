package com.zr.company.controller;

import com.zr.company.exceptions.SysException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionDemoController  {

    @RequestMapping(value = "/exceptions",method = {RequestMethod.GET})
    public String hello() throws SysException {
        try {
            int x = 1/0;
        } catch (Exception e) {
            throw new SysException("异常~~~");
        }
        return "success";
    }


}
