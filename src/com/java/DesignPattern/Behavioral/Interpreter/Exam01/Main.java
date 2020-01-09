package com.java.DesignPattern.Behavioral.Interpreter.Exam01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        try {

            File path1 = new File(".");
            System.out.println(path1.getAbsolutePath());
            String path = "/Users/lsh/Java/MyProject/study_Java_DesignPattern/src/com/java/DesignPattern/Behavioral/Interpreter/Exam01/program.txt";
            File path2 = new File(path);
            BufferedReader reader = new BufferedReader(new FileReader(path2));
            String text;

            while ((text = reader.readLine()) != null) {
                System.out.println("text = \"" + text + "\"");
                Node node = new ProgramNode(); // program이란 단어를 스킵하기 위해서 처음에 program 인스턴스를 만듦.
                node.parse(new Context(text));
                // 여기서 text는 한줄 읽은 명령어임.
                System.out.println("node = " + node);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
