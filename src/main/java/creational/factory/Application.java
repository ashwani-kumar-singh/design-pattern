package creational.factory;

import creational.factory.shape.Shape;

// https://www.geeksforgeeks.org/factory-method-for-designing-pattern/
public class Application {
    private final Shape shape;

    public Application(ShapeFactory shapeFactory) {
        shape = shapeFactory.getShape();
    }

    public Shape getShape() {
        return shape;
    }

    public static void main(String[] args) {
        Application application = new Application(new SquareShapeFactory());
        Shape square = application.getShape();
        System.out.println("Area of Square is: " + square.computeArea(5, 5));

        application = new Application(new RhombusShapeFactory());
        Shape rhombus = application.getShape();
        System.out.println("Area of Rhombus is: " + rhombus.computeArea(8, 6));

        application = new Application(new RectangleSquareFactory());
        Shape rectangle = application.getShape();
        System.out.println("Area of Rectangle is: " + rectangle.computeArea(5, 10));
    }
}
