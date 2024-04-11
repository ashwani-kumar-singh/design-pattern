package structural.bridge.vehicle;

import structural.bridge.workshop.Workshop;

public class Bike extends Vehicle {
    public Bike(Workshop workShop1, Workshop workShop2) {
        super(workShop1, workShop2);
    }

    @Override
    public void manufacture() {
        System.out.println("Bike.. ");
        workshop1.work();
        workshop2.work();
    }
}
