package com.company;

public class GasStation {
    String nameOfStation;
    String location;
    String manager;
    double pricePerLiterDiesel = 1.114;
    double pricePerLiterBenzin = 1.042;
    double account = 10000;
    double priceToPay;
    Car customerCar;
    Driver customer;

    public GasStation(String nameOfStation, String location, String manager) {
        this.nameOfStation = nameOfStation;
        this.location = location;
        this.manager = manager;
    }

    public void fillFuel(Car carToFillFuelIn, Driver customer){
        this.customerCar = carToFillFuelIn;
        customerCar.artOfFuel.toLowerCase();
        this.customer = customer;

        if(customerCar.artOfFuel.equalsIgnoreCase("benzin")){
            priceToPay = (customerCar.volumeOfTank - customerCar.fuelDisplay) * pricePerLiterBenzin;
        }
        else if (customerCar.artOfFuel.equalsIgnoreCase("diesel")){
            priceToPay = (customerCar.volumeOfTank - customerCar.fuelDisplay) * pricePerLiterDiesel;
        }
        customerCar.fuelDisplay = customerCar.volumeOfTank;
        customerCar.consumedFuel = 0;

        account = account + priceToPay;
        customer.money = customer.money - priceToPay;

    }


}
