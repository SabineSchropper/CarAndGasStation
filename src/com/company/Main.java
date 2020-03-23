package com.company;

public class Main {

    public static void main(String[] args) {
        String output = "";

        Car opelKarl = new Car("Opel", 55, "Benzin");
        GasStation station = new GasStation("Jet", "Feldkirch","Dieter Kraft");
        Driver driver = new Driver("Anton",30);
        Driver driver1 = new Driver("Olivia",25);
        Garage garage = new Garage("Werkstatt","Andreas Schrauber", "Rankweil");


        opelKarl.drive(Cities.BLUDENZ,Cities.BREGENZ);

        output = opelKarl.getStatusOutput();
        System.out.println(output);

        opelKarl.drive(Cities.INTOTHEBLUE, Cities.INTOTHEBLUE);

        output = opelKarl.getStatusOutput();
        System.out.println(output);

        for (int i = 0; i < 10; i++) {
            opelKarl.drive(Cities.BLUDENZ, Cities.BREGENZ);
        }

        station.fillFuel(opelKarl,driver);

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

        garage.buyNewWheels(opelKarl,driver);

        output = opelKarl.getStatusOutput();
        System.out.println(output);

    }
}
