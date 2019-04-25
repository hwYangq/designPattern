package com.designPattern.command;

/**
 * @Author: yanghw
 * @Date: 2019/4/24
 * @Description:
 */
public class LightOnCommand implements Command {

    private Light light;

    LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOn();
    }
}
