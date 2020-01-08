package com.java.DesignPattern.Behavioral.State.Exam01.Refactoring;

import com.java.DesignPattern.Behavioral.State.Exam01.Laptop;

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
