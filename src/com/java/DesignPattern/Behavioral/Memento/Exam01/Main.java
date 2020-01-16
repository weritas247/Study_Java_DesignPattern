package com.java.DesignPattern.Behavioral.Memento.Exam01;

public class Main {

    public static void main(String[] args) {

        Information info = new Information("AAA", 100); // Information 객체 생성
        CareTaker careTaker = new CareTaker(); // CareTaker 객체 생성
        // 현재 Information의 상태 정보를 가지는 Memento를 생성하여 CareTaker에 추가합니다.
        careTaker.push(info.CreateMemento());

        // Information 정보를 수정합니다.
        info.setData1("BBB");
        info.setData2(2000);

        // 현재 Information의 상태 정보를 출력합니다.
        System.out.println("현재 Data1: " + info.getData1());
        System.out.println("현재 Data2: " + info.getData2());

        // 가장 최근에 생성돈 Memento를 가지고와서 상태 정보를 복원합니다.
        info.RestoreMemento(careTaker.pop());

        // 상태 정보를 복원한 후에 Information의 상태 정보를 출력.
        System.out.println("\n복구된 Data1: " + info.getData1());
        System.out.println("복구된 Data2: " + info.getData2());

    }
}
