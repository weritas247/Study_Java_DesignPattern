package com.java.DesignPattern.Structural.Decorator.Exam01;

public class SandwichWithLettuce extends Sandwich {

    @Override
    public void make() {
        super.make();
        addLettuce();
    }

    private void addLettuce() {
        System.out.println(" + 양상추");
    }
}
