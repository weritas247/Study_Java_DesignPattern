package com.java.DesignPattern.Behavioral.Interpreter.Exam01;

public class CommandNode extends Node {

    private Node node;

    @Override
    public void parse(Context context) throws ParseException {

        // 여기서는 명령어가 repeat 커맨드인지 아닌지를 구분함.
        if (context.currentToken().equals("repeat")) {
            node = new RepeatCommandNode();
            node.parse(context);
        } else {
            node = new PrimitiveCommandNode();
            node.parse(context);
        }
    }

    @Override
    public String toString() {
        return node.toString();
    }
}
