package com.java.DesignPattern.Behavioral.Memento.Exam01;

public class Memento {
    // Information의 상태 정보를 가지고 있음.
    private String Data1;
    private int Data2;

    public Memento(String data1, int data2) {
        Data1 = data1;
        Data2 = data2;
    }

    public String getData1() {
        return Data1;
    }

    public int getData2() {
        return Data2;
    }
}
