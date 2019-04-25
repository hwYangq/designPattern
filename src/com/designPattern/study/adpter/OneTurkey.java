package com.designPattern.study.adpter;

/**
 * @Author: yanghw
 * @Date: 2019/4/25
 * @Description:
 */
public class OneTurkey implements Turkey {

    @Override
    public void fly() {
        System.out.println("turkey fly 2 s");
    }
}
