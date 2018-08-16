package com.imooc.enums;

import lombok.Getter;

/**
 * Created by zhichao on 2018/7/30.
 */
@Getter
public enum PayStatusEnum {

    WAIT(0,"等待支付"),SUCCESS(1,"支付成功");

    private Integer code;

    private String message;

    PayStatusEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
