package com.designPattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yanghw
 * @Date: 2019/4/24
 * @Description:
 */
public class Staff {

    private List<Command> list = new ArrayList<>();

    public void addCommand(Command command){
        list.add(command);
    }

    public void executeCommand(){
        list.forEach(e -> e.execute());
        list.clear();
    }
}
