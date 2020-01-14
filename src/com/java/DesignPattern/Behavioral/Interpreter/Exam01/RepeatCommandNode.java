package com.java.DesignPattern.Behavioral.Interpreter.Exam01;

public class RepeatCommandNode extends Node {

    private int number;
    private Node commandListNode;

    @Override
    public void parse(Context context) throws ParseException {
        // repeat 명령어의 경우는 repeat 3 이런식으로 쓰므로 3을 추출해야됨
        context.skipToken("repeat");
        number = context.currentNumber(); // 반복 횟수 추출
        context.nextToken(); // 다음것을 가리킴
        commandListNode = new CommandListNode(); // CommandListNode로 넘겨줌
        commandListNode.parse(context);
    }

    @Override
    public String toString() {
        return "[repeat " + number + " " + commandListNode + "]";
    }
}
