package creational.abstractfactory;

import creational.abstractfactory.car.Car;
import creational.abstractfactory.factory.CarFactory;
import creational.abstractfactory.factory.NorthAmericaCarFactory;
import creational.abstractfactory.factory.WesternEuropeCarFactory;
import creational.abstractfactory.specification.CarSpecification;

// https://www.geeksforgeeks.org/abstract-factory-pattern/
public class Client {

    private final Car car;
    private final CarSpecification specification;

    public Client(CarFactory carFactory){
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
