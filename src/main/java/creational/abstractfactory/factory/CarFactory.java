package creational.abstractfactory.factory;

import creational.abstractfactory.car.Car;
import creational.abstractfactory.specification.CarSpecification;

public interface CarFactory {
    Car getCar();
    CarSpecification getCarSpecification();
}
