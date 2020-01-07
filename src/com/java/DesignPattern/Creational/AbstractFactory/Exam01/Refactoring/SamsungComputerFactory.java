package com.java.DesignPattern.Creational.AbstractFactory.Exam01.Refactoring;

public class SamsungComputerFactory implements ComputerFactory {

    @Override
    public Keyboard createKeyboard() {
        return new SamsungKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new SamsungMouse();
    }
}
