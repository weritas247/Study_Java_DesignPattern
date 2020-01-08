package com.java.DesignPattern.Behavioral.Strategy.Exam01.Refactoring;

public class RailLoadStrategy implements MovableStrategy {
    @Override
    public void move() {
        System.out.println("선로를 통해 이동");
    }
}
