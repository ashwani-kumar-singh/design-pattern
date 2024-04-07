package creational.factory;

import creational.factory.shape.Rhombus;
import creational.factory.shape.Shape;

public class RhombusShapeFactory implements ShapeFactory {
    @Override
    public Shape getShape() {
        return new Rhombus();
    }
}
