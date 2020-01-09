package com.java.DesignPattern.Behavioral.Interpreter.Exam01;

import java.util.ArrayList;

public class CommandListNode extends Node {

    private ArrayList list = new ArrayList();


    @Override
    public void parse(Context context) throws ParseException {

        while (true) {
            if (context.currentToken() == null) {
                throw new ParseException("missing 'end'");
            } else if (context.currentToken().equals("end")) { // 여기가 끝나는점, 여기 때문에 무한루프가 안걸림
                context.skipToken("end");
                break;
            } else {
                // commandNodeList 다음에 commandNode로 넘어야됨
                // 명령어 리스트 다음에는 명령어 이므로
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
