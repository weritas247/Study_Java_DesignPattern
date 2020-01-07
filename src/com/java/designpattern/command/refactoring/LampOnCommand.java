package com.java.designpattern.command.refactoring;

public class LampOnCommand implements Command {

    private Lamp lamp;

    public LampOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void run() {
        lamp.turnOn();
    }
}
