package creational.abstractfactory;

import creational.abstractfactory.car.Car;
import creational.abstractfactory.factory.CarFactory;
import creational.abstractfactory.factory.NorthAmericaCarFactory;
import creational.abstractfactory.factory.WesternEuropeCarFactory;
import creational.abstractfactory.specification.CarSpecification;

// https://www.geeksforgeeks.org/abstract-factory-pattern/
public class Application {

    private final Car car;
    private final CarSpecification specification;

    public Application(CarFactory carFactory){
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
        Application application = new Application(new WesternEuropeCarFactory());
        application.getCar().assemble();
        application.getSpecification().display();

        application = new Application(new NorthAmericaCarFactory());
        application.getCar().assemble();
        application.getSpecification().display();
    }

}
