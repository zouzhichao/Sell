package com.imooc.enums;

import lombok.Getter;

/**
 * Created by zhichao on 2018/7/30.
 */
@Getter
public enum  ResultStatusEnum {

    SUCCESS(0,"success"),FAIL(1,"fail");

     ResultStatusEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }

    private Integer code;

    private String message;
}
