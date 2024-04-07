package creational.abstractfactory.factory;

import creational.abstractfactory.car.Car;
import creational.abstractfactory.car.Sedan;
import creational.abstractfactory.specification.CarSpecification;
import creational.abstractfactory.specification.NorthAmericaSpecification;

public class NorthAmericaCarFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Sedan();
    }

    @Override
    public CarSpecification getCarSpecification() {
        return new NorthAmericaSpecification();
    }
}
