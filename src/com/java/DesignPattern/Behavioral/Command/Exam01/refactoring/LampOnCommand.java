package com.java.DesignPattern.Behavioral.Command.Exam01.refactoring;

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
