package com.zr.company.exceptions;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class SysException extends Exception {
    // 接收异常信息
    private String msg;

    public SysException(String msg) {
        this.msg = msg;
    }
}
