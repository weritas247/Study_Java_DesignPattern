package com.java.DesignPattern.Behavioral.Visitor.Exam01;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
