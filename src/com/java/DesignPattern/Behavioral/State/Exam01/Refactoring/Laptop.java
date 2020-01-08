package com.java.DesignPattern.Behavioral.State.Exam01.Refactoring;

public class Laptop {
    private PowerState powerState;

    public Laptop() {
        this.powerState = new Off();
    }

    public void setPowerState(PowerState powerState) {
        this.powerState = powerState;
    }

    public void powerPush() {
        powerState.powerPush();
    }
}
