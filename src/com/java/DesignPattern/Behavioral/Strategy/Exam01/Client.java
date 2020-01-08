package com.java.DesignPattern.Behavioral.Strategy.Exam01;

public class Client {
    public static void main(String[] args) {
        Movable train = new Train();
        Movable bus = new Bus();

        train.move();
        bus.move();
    }
}
