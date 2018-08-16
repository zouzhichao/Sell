package com.imooc.utils;

import com.imooc.VO.ResultVO;
import com.imooc.enums.ResultStatusEnum;

/**
 * Created by zhichao on 2018/7/30.
 */
public class ResultVOUtil {

    /**
     * 返回数据
     *
     * @param o
     * @return
     */
    public static ResultVO success(Object o) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(ResultStatusEnum.SUCCESS.getCode());
        resultVO.setMsg(ResultStatusEnum.SUCCESS.getMessage());
        resultVO.setData(o);
        return resultVO;
    }

    /**
     * 返回值没有data
     *
     * @return
     */
    public static ResultVO success() {
        return success(null);
    }

    /**
     * 返回结果值失败
     * @param code
     * @param msg
     * @return
     */
    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}