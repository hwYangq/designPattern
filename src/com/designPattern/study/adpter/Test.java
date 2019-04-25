package com.designPattern.study.adpter;

/**
 * @Author: yanghw
 * @Date: 2019/4/25
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        Turkey turkey = new OneTurkey();
        Duck duck = new TurkeyAdapter(turkey);
        duck.fly();
    }
}
