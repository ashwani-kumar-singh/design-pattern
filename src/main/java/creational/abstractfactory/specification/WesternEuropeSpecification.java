package creational.abstractfactory.specification;

public class WesternEuropeSpecification implements CarSpecification{
    @Override
    public void display() {
        System.out.println("Western Europe Car Specification");
    }
}
