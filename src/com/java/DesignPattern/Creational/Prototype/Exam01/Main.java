package com.java.DesignPattern.Creational.Prototype.Exam01;

public class Main {
    public static void main(String[] args) throws Exception {
        Users originUsers = new Users();
        originUsers.loadData();
        originUsers.print();

        System.out.println("========================================");

        Users cloneUsers = (Users)originUsers.clone();
        cloneUsers.print();
    }
}
