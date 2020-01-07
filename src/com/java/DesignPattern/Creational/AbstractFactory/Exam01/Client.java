package com.java.DesignPattern.Creational.AbstractFactory.Exam01;

public class Client {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();
        computerFactory.createComputer("LG");


//        KeyboardFactory keyboardFactory = new KeyboardFactory();
//        MouseFactory mouseFactory = new MouseFactory();
//        BodyFactory bodyFactory = new BodyFactory();
//        MonitorFactory monitorFactory = new MonitorFactory();
//        SpeakerFactory speakerFactory = new SpeakerFactory();
//        PrinterFactory printerFactory = new PrinterFactory();
//
//        keyboardFactory.createKeyboard(type);
//        mouseFactory.createMouse(type);
//        bodyFactory.createBody(type);
//        monitorFactory.createMonitor(type);
//        speakerFactory.createSpeaker(type);
//        printerFactory.createPrinter(type);
//        System.out.println("--- " + type + " 컴퓨터 완성 ---");

    }
}
