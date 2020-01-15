package com.java.DesignPattern.Behavioral.Mediator.Exam01;

import java.util.ArrayList;
import java.util.List;

public interface ISource {

    public void setMediator(Mediator mediator);
    public void eventOccured(String event);
}

class TcpComm implements ISource {
    Mediator mediator;
    @Override
    public void setMediator(Mediator mediator) { // 중재자 설정
        this.mediator = mediator;
    }

    @Override
    public void eventOccured(String event) { // 이벤트의 전달
        mediator.onEvent("TCP comm", event);
    }
}

class SystemSignal implements ISource {
    Mediator mediator;
    @Override
    public void setMediator(Mediator mediator) { // 중재자 설정
        this.mediator = mediator;
    }

    @Override
    public void eventOccured(String event) { // 이벤트의 전달
        mediator.onEvent("TCP comm", event);
    }
}

interface IDestination {
    public void receiveEvent(String from, String event);
}

class Display implements IDestination {
    @Override
    public void receiveEvent(String from, String event) {
        System.out.println("Display : from " + from + " event : " + event);
    }
}

class Log implements IDestination {
    @Override
    public void receiveEvent(String from, String event) {
        System.out.println("Log : from " + from + " event : " + event);
    }
}

class Mediator {
    List<IDestination> list = new ArrayList<IDestination>();
    public void addDestination(IDestination destination) { list.add(destination); }

    public void onEvent(String from, String event) {
        for (IDestination each : list) { // 이벤트의 전송
            each.receiveEvent(from, event);
        }
    }
}