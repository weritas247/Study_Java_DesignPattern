package com.java.DesignPattern.Structural.Decorator.Exam01.Refactoring;

public class Bread extends Sandwich {

    @Override
    public void make() {
        System.out.println("빵 추가");
    }
}
