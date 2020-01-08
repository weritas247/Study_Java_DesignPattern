package com.java.DesignPattern.Structural.Decorator.Exam01.Refactoring;

public class ToppingDecorator extends Sandwich{
    private Sandwich sandwich;

    public ToppingDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public void make() {
        sandwich.make();
    }
}
