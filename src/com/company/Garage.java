package com.company;

public class Garage {
    String name;
    String manager;
    String location;
    Vehicle customerVehicle;
    Driver customer;
    double account = 10000;
    double priceToPay;

    public Garage(String name, String manager, String location) {
        this.name = name;
        this.manager = manager;
        this.location = location;
    }

    public void makeService(Vehicle customerVehicle, Driver driver){
        this.customerVehicle = customerVehicle;
        this.customer = driver;

        customerVehicle.setMileage(0);
        if (customerVehicle.brand.equalsIgnoreCase("opel")){
            priceToPay = 300;
        }
        else if (customerVehicle.brand.equalsIgnoreCase("TruckBrand")){
            priceToPay = 500;
        }
        else {
            priceToPay = 250;
        }
        account = account + priceToPay;
        customer.money = customer.money - priceToPay;

    }
    public void buyNewWheels(Vehicle customerVehicle, Driver driver){
        this.customerVehicle = customerVehicle;
        this.customer = driver;

        if (customerVehicle.brand.equalsIgnoreCase("opel")){
            priceToPay = 200;
        }
        else if (customerVehicle.brand.equalsIgnoreCase("TruckBrand")){
            priceToPay = 250;
        }
        else {
            priceToPay = 150;
        }
        customerVehicle.conditionOfTires = 100;
        account = account + priceToPay;
        customer.money = customer.money - priceToPay;
    }



}
