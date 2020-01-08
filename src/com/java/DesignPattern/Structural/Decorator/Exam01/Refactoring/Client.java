package com.java.DesignPattern.Structural.Decorator.Exam01.Refactoring;

public class Client {
    public static void main(String[] args) {
        // 양상추 샌드위치
        Sandwich sandwichWithLettuce = new LettuceDecorator(new Bread());
        sandwichWithLettuce.make();
        System.out.println("==========");

        // 양상추 + 피클 샌드위치
        Sandwich sandwichWithLettuceAandPickle = new PickeDecorator(new LettuceDecorator((new Bread())));
        sandwichWithLettuceAandPickle.make();
        System.out.println("==========");


        //  피클 + 양상추 샌드위치
        Sandwich sandwichWithPickleAndLettuce = new LettuceDecorator(new PickeDecorator((new Bread())));
        sandwichWithPickleAndLettuce.make();
    }
}
