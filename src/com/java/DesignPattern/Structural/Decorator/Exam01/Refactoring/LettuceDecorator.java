package com.java.DesignPattern.Structural.Decorator.Exam01.Refactoring;

public class LettuceDecorator extends ToppingDecorator {

    public LettuceDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public void make() {
        super.make();
        addLettuce();
    }

    private void addLettuce() {
        System.out.println("+ 양상추");
    }


}
