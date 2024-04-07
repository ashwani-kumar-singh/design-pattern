package creational.factory;

import creational.factory.shape.Rectangle;
import creational.factory.shape.Shape;

public class RectangleSquareFactory implements ShapeFactory {
    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}
