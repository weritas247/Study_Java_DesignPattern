package com.java.DesignPattern.Behavioral.ChainOfResponsibility.Exam01;

public class Main {

    public static void main(String[] args) {

        Receiver odd_receiver = new Odd_Receiver("홀수 리시버");
        Receiver even_receiver = new Even_Receiver("짝수 리시버");

        odd_receiver.setNext(even_receiver);

        for (int i = 0; i <= 20; i++) {
            odd_receiver.support(i);
        }
    }
}

/*
* 예제는 역할 사슬 패턴을 이용하여 1~20까지의 반복분을 수행하면서 각각의 수가 홀수인지 짝수인지
* 판단하는 프로그램을 구현
* */