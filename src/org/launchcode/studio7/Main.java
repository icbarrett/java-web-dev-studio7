package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

            CD cd = new CD(700, "SpiderMan", "cdROM");
            DVD dvd = new DVD(8000,  "IronMan", "DVDROM");

            cd.spinDisc();
            dvd.spinDisc();

            cd.readWaveLength();
            dvd.readWaveLength();

            cd.writeData();
            dvd.writeData();



        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
