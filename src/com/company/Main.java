package com.company;


import javax.imageio.IIOException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String output = "";


        GasStation station = new GasStation("Jet", "Feldkirch", "Dieter Kraft");
        Garage garage = new Garage("Werkstatt", "Andreas Schrauber", "Rankweil");
        Motorcycle yamaha = new Motorcycle("Yamaha", TypeOfFuel.BENZIN, 70);
        Truck truck = new Truck("TruckBrand", TypeOfFuel.BENZIN, 40);
        Driver driver = new Driver("Anton", 30);
        Driver driver2 = new Driver("Jakob", 28);
        Driver driver1 = new Driver("Olivia", 25);
        Car opelKarl = new Car("Opel", TypeOfFuel.BENZIN, 55);


        opelKarl.drive(Cities.BLUDENZ, Cities.BREGENZ);

        output = opelKarl.getStatusOutput();
        System.out.println(output);

        opelKarl.drive(Cities.INTOTHEBLUE, Cities.INTOTHEBLUE);

        output = opelKarl.getStatusOutput();
        System.out.println(output);

        for (int i = 0; i < 10; i++) {
            opelKarl.drive(Cities.BLUDENZ, Cities.BREGENZ);
        }

        station.fillFuel(opelKarl, driver);

        output = opelKarl.getStatusOutput();
        System.out.println(output);

        System.out.println(driver.toString());

        garage.makeService(opelKarl, driver);

        output = opelKarl.getStatusOutput();
        System.out.println(output);

        System.out.println(driver.toString());

        garage.buyNewWheels(opelKarl, driver);

        output = opelKarl.getStatusOutput();
        System.out.println(output);

        System.out.println(driver.toString());

        for (int i = 0; i < 12; i++) {
            opelKarl.drive(Cities.BLUDENZ, Cities.BREGENZ);
        }

        station.fillFuel(opelKarl, driver1);

        output = opelKarl.getStatusOutput();
        System.out.println(output);

        System.out.println(driver1.toString());
        System.out.println(driver.toString());

        garage.buyNewWheels(opelKarl, driver);

        output = opelKarl.getStatusOutput();
        System.out.println(output);

        yamaha.drive(Cities.BLUDENZ, Cities.FELDKIRCH);

        output = yamaha.getStatusOutput();
        System.out.println(output);

        garage.buyNewWheels(yamaha, driver2);

        truck.drive(Cities.BLUDENZ, Cities.FELDKIRCH);

        output = truck.getStatusOutput();
        System.out.println(output);

        garage.buyNewWheels(truck, driver);
        output = truck.getStatusOutput();
        System.out.println(output);

        System.out.println(driver.toString());
        garage.closeWriter();
        station.closeWriter();
    }
}
