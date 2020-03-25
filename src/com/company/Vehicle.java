package com.company;

import java.util.Random;

public abstract class Vehicle {

    String brand;
    Enum typeOfFuel;
    int performance;
    //consumption per 100 km
    double conditionOfTires;
    String output = "";
    double consumedFuel;
    double fuelDisplay;
    double kilometerToService;
    double volumeOfTank;
    double mileage;

    public Vehicle(String brand, Enum typeOfFuel, int performance) {
        this.brand = brand;
        this.typeOfFuel = typeOfFuel;
        this.performance = performance;
        //the new Vehicle has new Tires
        this.conditionOfTires = 100;
    }

    public abstract void drive(Cities startCity, Cities destinationCity);

    public String getStatusOutput() {
        output = "***" + this.brand + "***\n";
        output = output + "condition of tires: " + Math.round(conditionOfTires * 100.0) / 100.0;
        output = output + "\nfuelDisplay: " + fuelDisplay + " liter";
        output = output + "\n" + "kilometer to service: " + (kilometerToService - mileage) + "\n";
        return output;
    }

    public void setKilometerToService(double kilometerToService) {
        this.kilometerToService = kilometerToService;
    }

    public void setVolumeOfTank(double volumeOfTank) {
        this.volumeOfTank = volumeOfTank;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
}
