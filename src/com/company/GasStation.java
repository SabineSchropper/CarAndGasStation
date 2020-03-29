package com.company;

import java.io.IOException;

public class GasStation extends BillWriting {
    String nameOfStation;
    String location;
    String manager;
    double pricePerLiterDiesel = 1.114;
    double pricePerLiterBenzin = 1.042;
    double account = 10000;
    double priceToPay;
    Vehicle customerVehicle;
    Driver customer;

    public GasStation(String nameOfStation, String location, String manager){
        this.nameOfStation = nameOfStation;
        this.location = location;
        this.manager = manager;
    }

    public void fillFuel(Vehicle vehicleToFillFuelIn, Driver customer){
        this.customerVehicle = vehicleToFillFuelIn;
        this.customer = customer;
        String service = "Fill fuel";

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

        addToBill(service, priceToPay);



    }

    @Override
    public void addToBill(String service, double priceToPay){
        try {
            mywriter.write(customer.nameOfDriver + ";" + customerVehicle.brand+ ";" + service + ";" + priceToPay +";\n");
        }
        catch (IOException ex){
            ex.printStackTrace();
        }

    }

}
