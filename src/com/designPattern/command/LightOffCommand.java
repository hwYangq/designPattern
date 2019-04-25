package com.designPattern.command;

/**
 * @Author: yanghw
 * @Date: 2019/4/24
 * @Description:
 */
public class LightOffCommand implements Command {

    private Light light;

    LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOff();
    }
}
