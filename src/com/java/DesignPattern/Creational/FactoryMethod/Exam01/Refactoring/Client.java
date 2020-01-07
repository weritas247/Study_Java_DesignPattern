package com.java.DesignPattern.Creational.FactoryMethod.Exam01;

public class Client {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.createType("A");
        classA.createType("B");
    }
}
