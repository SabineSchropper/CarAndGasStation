package com.company;

import java.util.Random;

public class Car {
    String brand;
    //Leistung
    int performance;
    //Kilometerstand
    double mileage = 10000;
    double kilometerToService = 30000;
    //consumption per 100 km
    double consumptionOfFuel = 7.2;
    double volumeOfTank = 40;
    double fuelDisplay;
    double consumedFuel;
    double actualConsumptionOfFuel;
    double conditionOfTires = 100;
    double distance;
    String artOfFuel;
    String output = "";
    Random random =  new Random();


    public Car(String brand, int performance, String artOfFuel){
        this.brand = brand;
        this.performance = performance;
        this.artOfFuel = artOfFuel;
    }

    public void drive(Cities startCity, Cities destinationCity) {
        if((startCity == Cities.INTOTHEBLUE) || (destinationCity == Cities.INTOTHEBLUE)){
            distance = random.nextInt(100);
        }
        else {
            //Statische Methode, die die Distanz zwischen zwei Orten zurückgibt
            // DistanceCalculator beinhaltet die KLASSENmethode getDistance
            // wäre diese nicht static, so würde ich eine Objektinstanz (new DistanceCalculator) benötigen
            distance = DistanceCalculator.getDistance(startCity, destinationCity);
        }
            this.mileage = mileage + distance;
            kilometerToService = kilometerToService - distance;

            if (kilometerToService < 1000) {
                System.out.println("In weniger als 1000 km wird ein Service empfohlen.");
            }

            conditionOfTires = conditionOfTires - (distance * 0.01);

            if (conditionOfTires < 30) {
                System.out.println("Ein Reifenwechsel wird zu Ihrer Sicherheit empfohlen.");
            }
            actualConsumptionOfFuel = distance / 100 * consumptionOfFuel;
            consumedFuel = consumedFuel + actualConsumptionOfFuel;
            fuelDisplay = volumeOfTank - consumedFuel;
            // if there is only 20 % or less of fuel from total volume, then we need to fill fuel
            if (fuelDisplay <= volumeOfTank * 0.2) {
                System.out.println("Bitte Tanken! Sie haben noch " + (Math.round(fuelDisplay*100.0))/100.0 + " Liter Kraftstoff.");
            }

    }


    public String getStatusOutput(){
        output = "fuelDisplay: " + fuelDisplay + " liter";
        output = output + "\n" + "condition of tires: " + Math.round(conditionOfTires*100.0)/100.0;
        output = output + "\n" + "kilometer to service: " + kilometerToService +"\n";
        return output;
    }
}
