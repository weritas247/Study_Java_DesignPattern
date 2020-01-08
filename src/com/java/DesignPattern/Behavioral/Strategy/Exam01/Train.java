package com.java.DesignPattern.Behavioral.Strategy.Exam01;

public class Train implements Movable {

    @Override
    public void move() {
        System.out.println("선로를 통해 이동");
    }
}
