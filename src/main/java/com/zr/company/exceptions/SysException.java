package com.zr.company.exceptions;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SysException extends Exception {
    // 接收异常信息
    private String msg;

    public SysException(String msg) {
        this.msg = msg;
    }
}
