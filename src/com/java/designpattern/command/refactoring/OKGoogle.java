package com.java.designpattern.command.refactoring;

import com.java.designpattern.command.Heater;
import com.java.designpattern.command.Lamp;

public class OKGoogle {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void talk() {
        command.run();
    }

}
