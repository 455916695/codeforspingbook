package com.decisive.pattern._6_commandmode;

import java.util.Stack;

/**
 * 真正的控制器
 */
public class RemoteControl {

    Command[] onCommands;   //所有具有开的功能
    Command[] offCommands;  //所有具有关的功能

    Stack<Command> stack ;


    public RemoteControl(int commandNum) {
        this.onCommands = new Command[commandNum];
        this.offCommands = new Command[commandNum];
        Command noCommand = new NoCommand();
        for (int i = 0; i < commandNum; i++) {
            offCommands[i] = noCommand;
            onCommands[i] = noCommand;
        }
        stack = new Stack<>();  //初始化 回退栈
    }

    public void setOnCommands(int slot, Command command) {    //设置遥控器上的命令
        this.onCommands[slot] = command;
    }

    public void setOffCommands(int slot, Command command) {
        this.offCommands[slot] = command;
    }


    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        stack.push(onCommands[slot]);
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        stack.push(onCommands[slot]);
    }

    public void undoButtonWasPushed() {

        if (!stack.isEmpty()){
            Command pop = stack.pop();
            pop.undo();
        }

    }
}
