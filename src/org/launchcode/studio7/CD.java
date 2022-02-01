package org.launchcode.studio7;

public class CD extends BaseDisc {
    public CD (int storageCapacity, String name, String discType) {
        super(storageCapacity, name, discType);
    }
    @Override
    public void readWaveLength() {
        System.out.println("780 nanometers");
    }


    @Override
    public void writeData() {
        System.out.println("CD 1200 kib/sec");
    }

    @Override
    public void spinDisc() {
        System.out.println("CD spinning at 600 rpm");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
