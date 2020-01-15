package com.java.DesignPattern.Structural.Facade.Exam01;

public class Main {
    public static void main(String[] args) {
        CarFacade facade = new CarFacade(new Car());
        facade.drive();
        System.out.println("==============");
        facade.stop();
        System.out.println("==============");
        facade.park();
        System.out.println("==============");
    }
}
