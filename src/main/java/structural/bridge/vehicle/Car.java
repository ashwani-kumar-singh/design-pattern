package structural.bridge.vehicle;

import structural.bridge.workshop.Workshop;

public class Car extends Vehicle {

    public Car(Workshop workShop1, Workshop workShop2) {
        super(workShop1, workShop2);
    }

    @Override
    public void manufacture() {
        System.out.println("Car.. ");
        workshop1.work();
        workshop2.work();
    }
}
