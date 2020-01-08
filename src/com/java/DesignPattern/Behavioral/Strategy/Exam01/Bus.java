package com.java.DesignPattern.Behavioral.Strategy.Exam01;

public class Bus implements Movable {

    @Override
    public void move() {
        System.out.println("도로를 통해 이동");
    }
}
