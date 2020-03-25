package com.company;

public class GasStation {
    String nameOfStation;
    String location;
    String manager;
    double pricePerLiterDiesel = 1.114;
    double pricePerLiterBenzin = 1.042;
    double account = 10000;
    double priceToPay;
    Vehicle customerVehicle;
    Driver customer;

    public GasStation(String nameOfStation, String location, String manager) {
        this.nameOfStation = nameOfStation;
        this.location = location;
        this.manager = manager;
    }

    public void fillFuel(Vehicle vehicleToFillFuelIn, Driver customer){
        this.customerVehicle = vehicleToFillFuelIn;
        this.customer = customer;

        if(customerVehicle.typeOfFuel == TypeOfFuel.BENZIN){
            priceToPay = (customerVehicle.volumeOfTank - customerVehicle.fuelDisplay) * pricePerLiterBenzin;
        }
        else if (customerVehicle.typeOfFuel == TypeOfFuel.DIESEL){
            priceToPay = (customerVehicle.volumeOfTank - customerVehicle.fuelDisplay) * pricePerLiterDiesel;
        }
        customerVehicle.fuelDisplay = customerVehicle.volumeOfTank;
        customerVehicle.consumedFuel = 0;

        account = account + priceToPay;
        customer.money = customer.money - priceToPay;

    }


}
