package com.imooc.StaticTest;

/**
 * Created by zhichao on 2018/5/29.
 */
public class StaticTestUtils implements Runnable{

    private static StaticTestUtils st = null;

    public StaticTestUtils(){}

    public static StaticTestUtils getInstance(){
        synchronized (StaticTestUtils.class){
            if(null == st){
                st =  new StaticTestUtils();
            }
        }
        return st;
    }

    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        StaticTestUtils instance = getInstance();
        StaticTestUtils instance1 = getInstance();
        int i =  instance.equals(instance1) ? 1:0;
        System.out.println(i);

        String x = "3";
        String y = x;
        x = "4";
        System.out.println(y);
        StaticTestUtils staticTestUtils = new StaticTestUtils();
        StaticTestUtils staticTestUtils1 = new StaticTestUtils();
        staticTestUtils.run();
        staticTestUtils1.run();
        long l1 = System.currentTimeMillis();

        System.out.println(l1 - l);
    }

    @Override
    public void run() {

        for (int   x = 0;x< 100000; x++){
            Money.addMoney();
            System.out.println(Money.getMoney());
        }


    }
}
