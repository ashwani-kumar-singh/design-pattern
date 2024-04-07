package creational.abstractfactory.factory;

import creational.abstractfactory.car.Car;
import creational.abstractfactory.car.Hatchback;
import creational.abstractfactory.specification.CarSpecification;
import creational.abstractfactory.specification.WesternEuropeSpecification;

public class WesternEuropeCarFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Hatchback();
    }

    @Override
    public CarSpecification getCarSpecification() {
        return new WesternEuropeSpecification();
    }
}
