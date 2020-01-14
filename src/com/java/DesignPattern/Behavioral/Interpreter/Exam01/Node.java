package com.java.DesignPattern.Behavioral.Interpreter.Exam01;

public abstract class Node {
    public  abstract void parse(Context context) throws ParseException;
    // parse 메소드의 의미는 program go right 같은것을 읽는다는 의미임.
}
