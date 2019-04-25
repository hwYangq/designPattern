package com.designPattern.study.adpter;

/**
 * @Author: yanghw
 * @Date: 2019/4/25
 * @Description:
 */
public class OneDuck implements Duck {

    @Override
    public void fly() {
        System.out.println("duck fly 10 s");
    }
}
