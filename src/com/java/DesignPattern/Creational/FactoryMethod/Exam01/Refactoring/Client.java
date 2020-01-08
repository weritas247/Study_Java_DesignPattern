package com.java.DesignPattern.Creational.FactoryMethod.Exam01.Refactoring;

import com.java.DesignPattern.Creational.FactoryMethod.Exam01.ClassA;

import java.text.NumberFormat;

public class Client {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.createType("A");
        classA.createType("B");

    }
}
