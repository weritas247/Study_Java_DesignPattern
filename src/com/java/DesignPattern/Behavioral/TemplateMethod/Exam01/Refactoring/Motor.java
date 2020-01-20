package com.java.DesignPattern.Behavioral.TemplateMethod.Exam01.Refactoring;

public abstract class Motor {
    protected Door door;
    private MotorStatus motorStatus; // 공통 2. motorStatus 필드

    public Motor(Door door) { // 공통 1. Door 클래스와의 연관관계
        this.door = door;
        motorStatus = MotorStatus.STOPPED;
    }
    private void moveMotor(Direction direction) { }

    // 공통 3. etMotorStatus, setMotorStatus 메서드
    public MotorStatus getMotorStatus() { return motorStatus; }
    protected void setMotorStatus(MotorStatus motorStatus) { this.motorStatus = motorStatus; }

    // HyundaiMotor와 LGMotor의 move 메서드에서 공통되는 부분만을 가짐
    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        // 이미 이동 중이면 아무 작업을 하지 않음
        if (motorStatus == MotorStatus.MOVING) return;

        DoorStatus doorStatus = door.getDoorStatus();
        // 만약 문이 열려 있으면 우선 문을 닫음
        if (doorStatus == DoorStatus.OPENED) door.close();

        // 모터를 주어진 방향으로 이동시킴
        moveMotor(direction); // (HyundaiMotor와 LGMotor에서 오버라이드 됨)
        // 모터 상태를 이동 중으로 변경함
        setMotorStatus(MotorStatus.MOVING);
    }
}
