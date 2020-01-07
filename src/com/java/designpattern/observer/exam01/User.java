package com.java.designpattern.observer.exam01;

import java.util.List;

public class User {

    private List<Room> room;

    public void setRoom(List<Room> room) {
        this.room = room;
    }

    public void talk(String msg) {
        for (Room r:room) {
            r.receive(msg);
        }
    }
}
