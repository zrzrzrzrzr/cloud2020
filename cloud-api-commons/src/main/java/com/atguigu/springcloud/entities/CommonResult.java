package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: zhangruic
 * CreateDate: 2022/2/26 17:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private int code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message){
        this(code,message,null);
    }
}
