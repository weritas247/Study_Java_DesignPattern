package com.java.designpattern.observer.exam01.refactoring;

public class Observer {
    public String roomName;

    public void receive(String msg) {
        System.out.println(this.roomName + "에서 메시지를 받음 : " + msg);
    }
}
