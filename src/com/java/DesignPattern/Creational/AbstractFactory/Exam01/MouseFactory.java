package com.java.DesignPattern.Creational.AbstractFactory.Exam01;

public class MouseFactory {
    public Mouse createMouse(String type) {
        Mouse mouse = null;
        switch (type) {
            case "LG":
                mouse = new LGMouse();
                break;
            case "Samsung":
                mouse = new SamsungMouse();
                break;
        }

        return mouse;
    }
}
