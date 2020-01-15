package com.java.DesignPattern.Structural.Facade.Exam01;

public class CarFacade {

    Car car;

    public CarFacade(Car car) {
        this.car = car;
    }

    public void drive() {
        car.enginStart();
        car.doorLock();
        car.wheelsRoll();
    }

    public void stop() {
        car.enginStop();
        car.doorUlnock();
        car.wheelsStop();
    }

    public void park() {
        car.enginStop();
        car.doorLock();
        car.wheelsStop();
    }
}

class Car {
    public void enginStop() { System.out.println("engine stop"); }
    public void enginStart() { System.out.println("engine start"); }
    public void doorLock() { System.out.println("door locked"); }
    public void doorUlnock() { System.out.println("door unlocked"); }
    public void wheelsRoll() { System.out.println("wheels roll"); }
    public void wheelsStop() { System.out.println("wheels stop"); }
}

/*
* Car의 경우 부품인 엔진, 문, 바퀴 등의 동작에 대해 구현되어 있다고 하자. 이들 기능은 자동차의 동작에 매우 중요한 부분이긴 하지만,
* 일반적인 운전자 또는 자동차의 상태를 쉽게 조작하조 하는 사람들에게넨 각 부품을 일일이 조작하기는 힘들다.
* 따라서 CarFacade 클래스를 통해 사용자가 이해 하기 쉽게 자동차의 상태를 변경할 수 있도록 한다.
* 예를 들어 일반적인 운전자는 자동차를 운전(drvie), 정지(stop), 주차(park)와 같은 형태로 차의 상태를 조작하기를 원한다.
* 따라서 CarFacade가 drive/stop/park와 같은 Facade 메소드를 제공하여 주면 자동차를 한결 쉽게 운전할수 있게 될것이다.
* */