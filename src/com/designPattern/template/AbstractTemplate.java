package com.designPattern.template;

/**
 * @Author: yanghw
 * @Date: 2019/4/25
 * @Description:
 */
public abstract class AbstractTemplate {

    /**定义算法实现，final避免子类修改算法实现*/
    protected final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    protected void pourInCup(){
        System.out.println("pourInCup通用实现");
    }

    protected void boilWater() {
        System.out.println("boilWater通用实现");
    }

    /**
     * hook钩子方法供子类选择性实现
     */
    void hook(){}
}