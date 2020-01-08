package com.java.DesignPattern.Behavioral.State.Exam01.Refactoring;

public class On implements PowerState {
    @Override
    public void powerPush() {
        System.out.println("전원 Off");
    }
}
