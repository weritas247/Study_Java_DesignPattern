package com.java.DesignPattern.Behavioral.State.Exam01.Refactoring;

public class Saving implements PowerState {

    @Override
    public void powerPush() {
        System.out.println("전원 on");
    }
}
