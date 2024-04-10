package creational.factory;

import creational.factory.shape.Shape;

/**
 * Factory Design Pattern:  to provide an interface for creating objects in a superclass, while allowing subclasses to
 * alter the type of objects that will be created.
 * This enables flexibility, extensibility, and maintainability in the codebase by allowing subclasses
 * to define their own implementation of the factory method to create specific types of objects.
 *
 * @link: <a href="https://www.geeksforgeeks.org/factory-method-for-designing-pattern/">...</a>
 */
public class Client {
    private final Shape shape;

    public Client(ShapeFactory shapeFactory) {
        shape = shapeFactory.getShape();
    }

    public Shape getShape() {
        return shape;
    }

    public static void main(String[] args) {
        Client client = new Client(new SquareShapeFactory());
        Shape square = client.getShape();
        System.out.println("Area of Square is: " + square.computeArea(5, 5));

        client = new Client(new RhombusShapeFactory());
        Shape rhombus = client.getShape();
        System.out.println("Area of Rhombus is: " + rhombus.computeArea(8, 6));

        client = new Client(new RectangleSquareFactory());
        Shape rectangle = client.getShape();
        System.out.println("Area of Rectangle is: " + rectangle.computeArea(5, 10));
    }
}
