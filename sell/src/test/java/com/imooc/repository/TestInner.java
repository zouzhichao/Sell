package com.imooc.repository;

import org.junit.Test;

/**
 * Created by zhichao on 2018/8/6.
 */
public class TestInner {

    private String TestName ;

    public static void main(String[] args) {

    }

    public class Inner{

        private String age;
        public String getOtherNameAndAge(){

            return TestName + age;

        }
    }
}
