package com.java.DesignPattern.Behavioral.State.Exam01;

public class Client {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.powerPush();

//        laptop.setPowerState(Laptop.ON);
//        laptop.powerPush();
//
        laptop.setPowerState(Laptop.SAVING);
        laptop.powerPush();
//
//        laptop.setPowerState(Laptop.OFF);
//        laptop.powerPush();
//
//        laptop.setPowerState(Laptop.ON);
//        laptop.powerPush();
    }
}
