package com.java.DesignPattern.Creational.AbstractFactory.Exam01.Refactoring;

public class Client {
    public static void main(String[] args) {
        FactoryOfComputerFactory factoryOfComputerFactory = new FactoryOfComputerFactory();
        factoryOfComputerFactory.createComputer("Samsung");
    }
}
