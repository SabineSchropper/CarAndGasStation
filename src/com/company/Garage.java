package com.company;

public class Garage {
    String name;
    String manager;
    String location;
    Car customerCar;
    Driver customer;
    double account = 10000;
    double priceToPay;

    public Garage(String name, String manager, String location) {
        this.name = name;
        this.manager = manager;
        this.location = location;
    }

    public void makeService(Car car, Driver driver){
        this.customerCar = car;
        this.customer = driver;

        customerCar.kilometerToService = 30000;
        priceToPay = 300;
        account = account + priceToPay;
        customer.money = customer.money - priceToPay;

    }
    public void buyNewWheels(Car car, Driver driver){
        this.customerCar = car;
        this.customer = driver;

        customerCar.conditionOfTires = 100;
        priceToPay = 250;
        account = account + priceToPay;
        customer.money = customer.money - priceToPay;
    }



}
