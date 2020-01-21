package com.java.DesignPattern.Behavioral.Visitor.Exam02;

public interface CarElementVisitor {
    void visit(Wheel wheel);
    void visit(Engine engine);
    void visit(Body body);
    void visit(Car car);
}
