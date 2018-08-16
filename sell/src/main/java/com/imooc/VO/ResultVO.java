package com.imooc.VO;

import lombok.Data;

/**
 * 返回给前端的最外层对象
 * Created by zhichao on 2018/7/23.
 */
@Data
public class ResultVO<T> {
    /** 错误码. */
    private Integer code;

    /** 提示信息.*/
    private String msg;

    /** 返回的具体内容 */
    private T data;
}
