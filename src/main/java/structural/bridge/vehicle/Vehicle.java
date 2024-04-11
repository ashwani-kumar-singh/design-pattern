package structural.bridge.vehicle;

import structural.bridge.workshop.Workshop;

public abstract class Vehicle {
    protected Workshop workshop1;
    protected Workshop workshop2;

    protected Vehicle(Workshop workShop1, Workshop workShop2)
    {
        this.workshop1 = workShop1;
        this.workshop2 = workShop2;
    }

    abstract public void manufacture();
}
