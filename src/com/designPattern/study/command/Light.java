package com.designPattern.study.command;

/**
 * @Author: yanghw
 * @Date: 2019/4/24
 * @Description:
 */
public class Light {

    private String name;

    Light(String name){
        this.name = name;
    }

    public void lightOn(){
        System.out.println("light "+ name + "打开");
    }

    public void lightOff(){
        System.out.println("light "+ name + "关闭");
    }
}
