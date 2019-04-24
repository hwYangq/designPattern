package com.designPattern.study.command;

/**
 * @Author: yanghw
 * @Date: 2019/4/24
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        Light light = new Light("命令模式灯泡");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        Staff staff = new Staff();
        staff.addCommand(lightOnCommand);
        staff.addCommand(lightOffCommand);
        staff.executeCommand();
    }
}
