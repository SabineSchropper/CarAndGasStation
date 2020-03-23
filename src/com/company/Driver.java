package com.company;

public class Driver {
    String nameOfDriver;
    int age;
    double money = 1000;

    public Driver(String nameOfDriver, int age) {
        this.nameOfDriver = nameOfDriver;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Driver "+ nameOfDriver +
                ", money = " + Math.round(money*100.0)/100.0;
    }
}
