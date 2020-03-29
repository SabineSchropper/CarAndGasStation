package com.company;

import java.io.IOException;

public class Garage extends BillWriting{
    String name;
    String manager;
    String location;
    Vehicle customerVehicle;
    Driver customer;
    double account = 10000;
    double priceToPay;

    public Garage(String name, String manager, String location){
        this.name = name;
        this.manager = manager;
        this.location = location;
    }


    public void makeService(Vehicle customerVehicle, Driver driver){
        this.customerVehicle = customerVehicle;
        this.customer = driver;
        String service = "Service";

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

        addToBill(service,priceToPay);


    }
    public void buyNewWheels(Vehicle customerVehicle, Driver driver){
        this.customerVehicle = customerVehicle;
        this.customer = driver;
        String service = "New Wheels";

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
        addToBill(service,priceToPay);
    }


    @Override
    public void addToBill(String service, double priceToPay) {
            try {
                mywriter.write(customer.nameOfDriver + ";" + customerVehicle.brand + ";" + service + ";" + priceToPay+";\n");
            }
            catch (IOException ex){
                ex.printStackTrace();
            }

    }


}
