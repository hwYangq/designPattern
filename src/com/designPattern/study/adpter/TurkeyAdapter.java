package com.designPattern.study.adpter;

/**
 * @Author: yanghw
 * @Date: 2019/4/25
 * @Description:
 */
public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
