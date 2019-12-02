package com.zr.company.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class UserBean {
    private String username;
    private String password;
    private Date date;
}
