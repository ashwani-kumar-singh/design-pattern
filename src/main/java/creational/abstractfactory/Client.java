package creational.abstractfactory;

import creational.abstractfactory.car.Car;
import creational.abstractfactory.factory.CarFactory;
import creational.abstractfactory.factory.NorthAmericaCarFactory;
import creational.abstractfactory.factory.WesternEuropeCarFactory;
import creational.abstractfactory.specification.CarSpecification;

/**
 * Abstract Factory : provides an interface for creating families of related or dependent objects
 * without specifying their concrete classes, in simpler terms the Abstract Factory Pattern is a way
 * of organizing how you create groups of things that are related to each other.
 * Abstract Factory pattern is almost similar to Factory Pattern and is considered as another layer
 * of abstraction over factory pattern.
 * Abstract Factory patterns work around a super-factory which creates other factories.
 *
 * @link: <a href="https://www.geeksforgeeks.org/abstract-factory-pattern/">...</a>
 */

public class Client {

    private final Car car;
    private final CarSpecification specification;

    public Client(CarFactory carFactory) {
        car = carFactory.getCar();
        specification = carFactory.getCarSpecification();
    }

    public Car getCar() {
        return car;
    }

    public CarSpecification getSpecification() {
        return specification;
    }

    public static void main(String[] args) {
        Client client = new Client(new WesternEuropeCarFactory());
        client.getCar().assemble();
        client.getSpecification().display();

        client = new Client(new NorthAmericaCarFactory());
        client.getCar().assemble();
        client.getSpecification().display();
    }

}
