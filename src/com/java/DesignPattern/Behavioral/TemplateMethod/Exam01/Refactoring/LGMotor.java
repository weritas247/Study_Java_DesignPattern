package com.java.DesignPattern.Behavioral.TemplateMethod.Exam01.Refactoring;

public class LGMotor extends Motor{

    public LGMotor(Door door) {
        super(door);
    }

    @Override
    public void move(Direction direction) {
        // LG Motor를 구동시킴
        System.out.println("LG Motor 구동");
    }
}
