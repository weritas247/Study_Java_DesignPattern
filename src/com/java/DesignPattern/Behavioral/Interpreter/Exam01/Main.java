package com.java.DesignPattern.Behavioral.Interpreter.Exam01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        try {
            // 현재 프로젝트 경로 가져오기
            System.out.println("현재 프로젝트의 경로 : " + System.getProperty("user.dir"));

            String path = System.getProperty("user.dir")
                    + "/src/com/java/DesignPattern/Behavioral/Interpreter/Exam01/program.txt";

            BufferedReader reader = new BufferedReader(new FileReader(path));
            String text;

            while ((text = reader.readLine()) != null) {
                System.out.println("text = \"" + text + "\"");
                Node node = new ProgramNode(); // program이란 단어를 스킵하기 위해서 처음에 program 인스턴스를 만듦.
                node.parse(new Context(text)); // 이때 skip하거나 next 명령어를 처리하는 것은 Context 클래스이므로 인스턴스를 넘겨줌
                System.out.println("node = " + node + "\n"); // 여기서 text는 한줄 읽은 명령어임.
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*
        * 간단하게 명령어를 입력하면 각 클래스가 자기가 맡은 부분만 처리하고 다른 부분은 다른 클래스로 넘기게 됩니다.
        * 또한 새로운 명령어가 나오면 새로운 클래스를 생성하기만 하면 됩니다.
       * */
    }
}
