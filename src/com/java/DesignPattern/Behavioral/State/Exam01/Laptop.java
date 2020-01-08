package com.java.DesignPattern.Behavioral.State.Exam01;

public class Laptop {
    public static String ON = "on";
    public static String OFF = "off";
    public static String SAVING = "saving";
    private String powerState = "";

    public Laptop() {
        setPowerState(Laptop.OFF);
    }

    public void setPowerState(String powerState) {
        this.powerState = powerState;
    }

    public void powerPush() {
        if ("on".equals(this.powerState)) {
            System.out.println("전원 off");
        } else if ("saving".equals(this.powerState)) {
            System.out.println("전원 on");
        } else {
            System.out.println("절전 모드");
        }
    }
}
