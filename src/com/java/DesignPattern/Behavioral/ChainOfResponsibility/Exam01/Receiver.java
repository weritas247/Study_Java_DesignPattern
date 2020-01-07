package com.java.DesignPattern.Behavioral.ChainOfResponsibility.Exam01;

public abstract class Receiver {

    public String name; // 리시버 이름
    private Receiver next = null; // 다음 수신 객체

    public Receiver(String name) {
        this.name = name;
    }

    public void setNext(Receiver next) { // 다음에 수신 할 객체 지정
        this.next = next;
    }

    public final void support(int number) { // 처리
        if (resolve(number)) { // 해당 수신 객체가 요청 처리를 하였는지 판단
            done(number);
        } else if (next != null) { // 처리 요청을 못했다면 다음 수신 객체에게 처리 요청
            next.support(number);
        } else { // 사슬에 있는 어떠한 객체도 처리 못 한 경우
            System.out.println("어떤 객체도 처리하지 모샇");
        }
    }

    public abstract boolean resolve(int number);
    public abstract void done(int number);
}

/*
* 수신 객체가 가져야할 공통 인터페이스를 정의 및 구현하는 Receiver 클래스 입니다.
* 자신이 처리 못한 문제를 다음 객체에게 넘기기 위해서 자기 자신의 인스턴스를 가지는 형태입니다.
* setNext()를 통해 다음 처리 요청을 할 수신 객체를 지정하고, support()를 통해 처리 요청이 완료 여부에 따라
* 분기하고 있는 형태입니다.
* */