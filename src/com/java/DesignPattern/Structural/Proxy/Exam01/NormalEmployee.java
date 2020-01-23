package com.java.DesignPattern.Structural.Proxy.Exam01;

// 직책 등급(차례대로 조직원, 조직장, 부사장)
enum GRADE {
    Staff, Manager, VicePresident
}

// 구성원
interface Employee {
    String getName(); // 구성원의 이름
    GRADE getGrade(); // 구성원의 직책
    String getInformation(Employee viewer); // 구성원의 인사정보(매개변수는 조회자)
}

// 일반 구성원
class NormalEmployee implements Employee {
    private String name;
    private GRADE grade;

    public NormalEmployee(String name, GRADE grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public GRADE getGrade() {
        return grade;
    }

    // 기본적으로 자신의 인사정보는 누구나 열람할 수 있도록 되어있습니다.
    @Override
    public String getInformation(Employee viewer) {
        return "Display " + getGrade().name() + " '" + getName() + "' personnel information.";
    }
}