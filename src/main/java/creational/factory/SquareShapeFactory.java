package creational.factory;

import creational.factory.shape.Shape;
import creational.factory.shape.Square;

public class SquareShapeFactory implements ShapeFactory {
    @Override
    public Shape getShape() {
        return new Square();
    }
}
