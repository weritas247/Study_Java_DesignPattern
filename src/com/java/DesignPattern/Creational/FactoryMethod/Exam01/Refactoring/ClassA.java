package com.java.DesignPattern.Creational.FactoryMethod.Exam01.Refactoring;

public class ClassA {
    public Type createType(String type) {
        TypeFactory factory = new TypeFactory();
        Type returnType = factory.createType(type);

        return returnType;
    }
}
