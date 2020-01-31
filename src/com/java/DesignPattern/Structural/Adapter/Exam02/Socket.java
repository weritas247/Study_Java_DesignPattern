package com.java.DesignPattern.Structural.Adapter.Exam02;

public class Socket {

    public Volt getVolt(){
        return new Volt(120);
    }
}