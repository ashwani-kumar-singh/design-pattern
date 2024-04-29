package creational.abstractfactory.specification;

public class NorthAmericaSpecification implements CarSpecification {
    @Override
    public void display() {
        System.out.println("North America Car Specification");
    }
}
