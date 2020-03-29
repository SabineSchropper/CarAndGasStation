package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public abstract class BillWriting {
        File myFile = new File("C:\\Users\\DCV\\Documents\\AutoUndWerkstattRechnungen");
        FileWriter mywriter;

    {
        try {
            mywriter = new FileWriter(myFile, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public abstract void addToBill(String service, double priceToPay) throws IOException;

    public void closeWriter(){
        try {
            mywriter.close();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }


}
