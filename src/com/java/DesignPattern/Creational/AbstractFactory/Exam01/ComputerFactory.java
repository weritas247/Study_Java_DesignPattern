package com.java.DesignPattern.Creational.AbstractFactory.Exam01;

public class ComputerFactory {

    public void createComputer(String type) {
        KeyboardFactory keyboardFactory = new KeyboardFactory();
        MouseFactory mouseFactory = new MouseFactory();

        keyboardFactory.createKeyboard(type);
        mouseFactory.createMouse(type);

        System.out.println("--- " + type + "컴퓨터 완성 ---");
    }
}
