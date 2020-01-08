package com.java.DesignPattern.Structural.Decorator.Exam01.Refactoring;

public class PickeDecorator extends ToppingDecorator {

    public PickeDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public void make() {
        super.make();
        addPickle();
    }

    private void addPickle() {
        System.out.println("+ 피클");
    }
}
