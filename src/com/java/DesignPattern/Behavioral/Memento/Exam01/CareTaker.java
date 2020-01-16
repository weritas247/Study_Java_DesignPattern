package com.java.DesignPattern.Behavioral.Memento.Exam01;

import java.util.Stack;

public class CareTaker {

    Stack<Memento> mementos = new Stack<>(); // Memento 관리를 위한 Stack

    public void push(Memento memento) {
        mementos.push(memento);
    }

    public Memento pop() {
        return mementos.pop();
    }
}

/*
* CareTaker는 Information의 상태 정보를 저장하고 있는  Memento들을 관리하기 위한 클래스입니다. 내부적으로 Memento를 저장하기 위한
* Stack 자료 구조가 존재하며 push와 pop을 통해 Memento객체를 저장하고 복원을 하게 됩니다.
* */