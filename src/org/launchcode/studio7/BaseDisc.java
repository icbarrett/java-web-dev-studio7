package org.launchcode.studio7;

public class BaseDisc (int storageCapacity, String name, String disctype) {

    this.storageCapacity = storageCapacity;
    this.name = name;
    this.discType = discType;

    public BaseDisc(int storageCapacity, String name, String discType) {
    }

    public abstract void readWaveLength();
    public abstract void writeData();

    public abstract void spinDisc();
}
