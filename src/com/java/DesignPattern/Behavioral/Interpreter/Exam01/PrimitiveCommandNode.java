package com.java.DesignPattern.Behavioral.Interpreter.Exam01;

public class PrimitiveCommandNode extends Node {

    private String name;

    @Override
    public void parse(Context context) throws ParseException {

        // repeat 명령어가 아니면 여기를 오게됨
        name = context.currentToken(); // 현재 명령어 받아오고
        context.skipToken(name); // 다음 명령어 가리킴

        // go, right, left가 아니면 예외 발생
        if (!name.equals("go") && !name.equals("right") && !name.equals("left")) {
            throw new ParseException(name + "is undefined");
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
