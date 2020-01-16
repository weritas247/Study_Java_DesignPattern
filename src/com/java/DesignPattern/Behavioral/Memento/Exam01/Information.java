package com.java.DesignPattern.Behavioral.Memento.Exam01;

public class Information {
    private String Data1; // information이 가지고 있는 데이터1
    private int Data2; // information이 가지고 있는 데이터1

    public Information(String data1, int data2) {
        Data1 = data1;
        Data2 = data2;
    }

    public Memento CreateMemento() { // Memento를 생성합니다.(상태 저장)
        return new Memento(this.Data1, this.Data2);
    }

    public void RestoreMemento(Memento memento) { // Memento를 복원 합니다. (상태 복원)
        this.Data1 = memento.getData1();
        this.Data2 = memento.getData2();
    }

    public void setData1(String data1) {
        Data1 = data1;
    }

    public void setData2(int data2) {
        Data2 = data2;
    }

    public String getData1() {
        return Data1;
    }

    public int getData2() {
        return Data2;
    }
}
/*
* 실제 데이터 값을 가지고 있는 Information 클래스입니다. Information 클래스는 String형 데이터 Data1과
* int 형 데이터 Data2를 속성으로 가지고 각각 setter/getter 메서드가 구현되어 있습니다.
* 현재 Information 상태를 저장하기 위한 CreateMemento 메서드(내부적으로 Data1과 Data2의 데이터 값을 가지는
* Memento 객체를 생성)와 상태 복원을 위한 RestoreMemento가 구현되어 있습니다.
* RestoreMemento는 이전에 생성된 Memento 객체의 정보를 가져와 Information 상태 정보로 setting을 하게 됩니다
* */