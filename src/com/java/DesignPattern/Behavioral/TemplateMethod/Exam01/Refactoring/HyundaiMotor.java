package com.java.DesignPattern.Behavioral.TemplateMethod.Exam01.Refactoring;

public class HyundaiMotor extends Motor {
    public HyundaiMotor(Door door) {
        super(door);
    }

    @Override
    public void move(Direction direction) {
        // Hyundai Motor를 구동시킴
        System.out.println("Hyundai Motor 구동");
    }
}

