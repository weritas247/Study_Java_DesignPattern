package com.java.DesignPattern.Creational.Prototype.Exam01;

import java.util.ArrayList;
import java.util.List;

public class Users implements Cloneable {
    private List<String> userList;

    public Users() {
        userList = new ArrayList();
    }

    public Users(List<String> userList) {
        this.userList = userList;
    }

    public void loadData() {
        userList.add("AAA");
        userList.add("BBB");
        userList.add("CCC");
        userList.add("DDD");
    }

    public void print() {
        this.userList.forEach(s -> System.out.println(s));
    }

    public List<String> getUserList() {
        return userList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List temp = new ArrayList();
        for (String s : this.getUserList()) {
            temp.add(s);
        }

        return new Users(temp);
    }
}
