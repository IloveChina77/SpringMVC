package com.zr.company.converters;


import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverters implements Converter<String, Date> {

    @Override
    public Date convert(String s) {
        if("".equals(s)) {
            throw new RuntimeException("请输入数据");
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return df.parse(s);
        } catch (Exception e) {
            throw new RuntimeException("String 转 Date 出现异常");
        }
    }
}
