package com.decisive.pattern._6_commandmode;

/**
 *  命令接口
 * */
public interface Command {

    /**
     * 执行
     * */
    public void execute();

    /**
     *  回退
     * */
    void undo();
}
