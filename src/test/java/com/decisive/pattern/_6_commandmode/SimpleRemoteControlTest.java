package com.decisive.pattern._6_commandmode;


import org.junit.Test;

public class SimpleRemoteControlTest {

    @Test
    public void test() {

        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();    //遥控器就是调用者，通过




        simpleRemoteControl.setCommand(new LightCommandImpl(new Light()));

        simpleRemoteControl.buttonWasPressed();
    }


}
