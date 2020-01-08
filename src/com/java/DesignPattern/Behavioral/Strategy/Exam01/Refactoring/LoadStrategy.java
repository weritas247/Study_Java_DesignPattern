package com.java.DesignPattern.Behavioral.Strategy.Exam01.Refactoring;

public class LoadStrategy implements MovableStrategy {

    @Override
    public void move() {
        System.out.println("도로를 통해 이동");
    }
}
