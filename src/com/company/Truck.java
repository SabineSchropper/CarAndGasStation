package com.company;

import java.util.Objects;
import java.util.Random;

public class Truck extends Vehicle {

    double consumptionOfFuel = 15.0;
    double actualConsumptionOfFuel;
    double distance;
    String output = "";
    Random random =  new Random();

    public Truck(String brand, Enum typeOfFuel, int performance) {
        super(brand, typeOfFuel, performance);
        setKilometerToService(20000);
        setVolumeOfTank(60);
        setMileage(1000);
    }

    @Override
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

        if (mileage > (kilometerToService-1000)) {
            System.out.println("In weniger als 1000 km wird ein Service empfohlen.");
        }

        conditionOfTires = conditionOfTires - (distance * 0.02);

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
}
