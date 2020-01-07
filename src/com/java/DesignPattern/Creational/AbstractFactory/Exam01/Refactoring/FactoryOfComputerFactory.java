package com.java.DesignPattern.Creational.AbstractFactory.Exam01.Refactoring;

public class FactoryOfComputerFactory {
    public void createComputer(String type) {
        ComputerFactory computerFactory = null;
        switch (type) {
            case "LG":
                computerFactory = new LGComputerFactory();
                break;
            case "Samsung":
                computerFactory = new SamsungComputerFactory();
                break;
        }

        computerFactory.createKeyboard();
        computerFactory.createMouse();
    }
}
