package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc{
    public DVD (int storageCapacity, String name, String discType) {
        super(storageCapacity, name, discType);
    }
    @Override
    public void readWaveLength() {
        System.out.println("wavelength of 650 nanometers");
    }

    @Override
    public void writeData() {
        System.out.println("DVD 10.5 nano/bidskib/sec");
    }

    @Override
    public void spinMax() {

    }

    @Override
    public void spinDisc() {
        System.out.println("dvd spinning at 1500 rpm");
    }

//    @Override
//    public void spinMax() {
//        if (MAXSPIN > currentSpin
//    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
