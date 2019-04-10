package com.decisive.pattern._6_commandmode;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("什么都不做");
    }

    @Override
    public void undo() {

    }
}
