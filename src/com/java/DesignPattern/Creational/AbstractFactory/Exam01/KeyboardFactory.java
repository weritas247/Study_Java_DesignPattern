package com.java.DesignPattern.Creational.AbstractFactory.Exam01;

public class KeyboardFactory {

    public Keyboard createKeyboard(String type) {
        Keyboard keyboard = null;
        switch (type) {
            case "LG":
                keyboard = new LGKeyboard();
                break;
            case "Samsung":
                keyboard = new SamsungKeyboard();
                break;
        }

        return keyboard;
    }
}
