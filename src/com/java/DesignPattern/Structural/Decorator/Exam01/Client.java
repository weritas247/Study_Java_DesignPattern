package com.java.DesignPattern.Structural.Decorator.Exam01;

public class Client {
    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
        sandwich.make();
        System.out.println("=============");

        SandwichWithLettuce sandwichWithLettuce = new SandwichWithLettuce();
        sandwichWithLettuce.make();
        System.out.println("=============");

        SandwichWithPickle sandwichWithPickle = new SandwichWithPickle();
        sandwichWithPickle.make();
    }
}
