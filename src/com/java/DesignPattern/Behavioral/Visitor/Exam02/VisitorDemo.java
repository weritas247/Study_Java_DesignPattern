package com.java.DesignPattern.Behavioral.Visitor.Exam02;

public class VisitorDemo {
    static public void main(String[] args){
        Car car = new Car();
        car.accept(new CarElementPrintVisitor()); // 알고리즘 적용
//        car.accept(new CarElementDoVisitor());  // 알고리즘 적용
    }
}