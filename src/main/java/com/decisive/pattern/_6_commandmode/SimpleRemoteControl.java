package com.decisive.pattern._6_commandmode;

/**
 * 遥控器类
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {

    }

    public void setCommand(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed() {
        slot.execute();    //遥控不需要知道 谁执行的， 怎么执行 都不需要知道
    }

}
