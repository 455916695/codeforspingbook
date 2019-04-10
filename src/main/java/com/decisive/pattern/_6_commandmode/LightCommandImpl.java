package com.decisive.pattern._6_commandmode;

/**
 * 具体的开灯接口
 */
public class LightCommandImpl implements Command {

    private Light light;

    public LightCommandImpl(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();     //此处只执行一步，事实上可以执行很多步
    }


    public void undo() {
        light.off();




    }
}
