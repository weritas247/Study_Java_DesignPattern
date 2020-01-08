package com.java.DesignPattern.Behavioral.State.Exam01.Refactoring;

public class Off implements PowerState {
    @Override
    public void powerPush() {
        System.out.println("절전 모드");
    }
}
