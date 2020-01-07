package com.java.designpattern.command.exam01.refactoring;

public class OKGoogle {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void talk() {
        command.run();
    }

}
