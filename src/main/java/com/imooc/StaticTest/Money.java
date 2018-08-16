package com.imooc.StaticTest;

/**
 * Created by zhichao on 2018/5/29.
 */
public class Money {
    private static int money = 0;

    public static int getMoney(){
        return money;
    }
    public static void addMoney(){
        money = ++money;
    }
}
