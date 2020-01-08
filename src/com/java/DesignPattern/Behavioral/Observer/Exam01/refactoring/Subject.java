package com.java.DesignPattern.Behavioral.Observer.Exam01.refactoring;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    // 옵저버에 추가
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // 옵저버에서 제거
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // 옵저버들에게 알림
    public void notifyObservers(String msg) {
        for (Observer o:observers) {
            o.receive(msg);
        }
    }
}
