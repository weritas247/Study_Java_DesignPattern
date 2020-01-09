package com.java.DesignPattern.Behavioral.Interpreter.Exam01;

public class ProgramNode extends Node {

    private Node commandListNode;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("program"); // program이란 명령어는 skip함
        commandListNode = new CommandListNode(); // 그 다음 명령어리스트 처리를 위해 인스턴스를 만들고
        commandListNode.parse(context); // Co
    }

    @Override
    public String toString() {
        return "ProgramNode{" +
                "commandListNode=" + commandListNode +
                '}';
    }
}
