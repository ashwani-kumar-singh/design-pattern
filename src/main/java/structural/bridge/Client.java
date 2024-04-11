package structural.bridge;

import structural.bridge.vehicle.Bike;
import structural.bridge.vehicle.Car;
import structural.bridge.vehicle.Vehicle;
import structural.bridge.workshop.Assemble;
import structural.bridge.workshop.Produce;
import structural.bridge.workshop.Workshop;

/**
 *  Bridge Pattern: The Bridge design pattern allows you to separate the abstraction from the
 *  implementation. The client code can access only the Abstraction.
 *  Bridge is designed up-front to let the abstraction and the implementation vary independently.
 *
 *  Note: We can simply add new workshop without adding new vehicle.Vehicle do not know the details
 *  where vehicle is assembled and produced.
 *
 * @link: <a href="https://www.geeksforgeeks.org/bridge-design-pattern/">...</a>
 */
public class Client {
    public static void main(String[] args) {
        Workshop produce = new Produce();
        Workshop assemble = new Assemble();
        Vehicle car = new Car(produce, assemble);
        car.manufacture();

        Vehicle bike = new Bike(produce, assemble);
        bike.manufacture();

    }
}
