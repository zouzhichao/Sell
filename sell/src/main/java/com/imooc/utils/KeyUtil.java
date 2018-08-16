package com.imooc.utils;

import java.util.Random;

/**
 * Created by zhichao on 2018/8/6.
 */
public class KeyUtil {

    /**
     * 生成唯一主键
     * 格式：时间+ 随机数
     * @return
     */
    public static synchronized String genUniqueKey(){
        Random random = new Random();
        Integer a = random.nextInt(900000 + 100000);

        return System.currentTimeMillis() + String.valueOf(a);
    }
}
