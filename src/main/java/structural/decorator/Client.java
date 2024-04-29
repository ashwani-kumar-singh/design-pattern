package structural.decorator;

/**
 * Decorator Design Pattern: It allows behavior to be added to individual objects, dynamically,
 * without affecting the behavior of other objects from the same class. This pattern is useful when
 * you need to add functionality to objects in a flexible and reusable way.
 *
 * This avoids class explosion
 *
 * @link: <a href="https://www.geeksforgeeks.org/decorator-pattern/">...</a>
 */
public class Client {
    public static void main(String[] args) {

        CoffeeDecorator coffee = new MilkDecorator(new PlainCoffee());
        System.out.println("Coffee Desc: " + coffee.getDescription() + " | Cost: " + coffee.getCost());

        coffee = new MilkDecorator(new SugarDecorator(new PlainCoffee()));
        System.out.println("Coffee Desc: " + coffee.getDescription() + " | Cost: " + coffee.getCost());

    }
}
