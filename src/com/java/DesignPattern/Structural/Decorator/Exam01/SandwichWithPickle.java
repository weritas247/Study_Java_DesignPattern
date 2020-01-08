package com.java.DesignPattern.Structural.Decorator;

public class SandwichWithPickle extends Sandwich {
    @Override
    public void make() {
        super.make();
        addPicke();
    }

    private void addPicke() {
        System.out.println(" + 피클");
    }
}
