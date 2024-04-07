package creational.factory.shape;

public class Rectangle implements Shape {
    @Override
    public double computeArea(float param1, float param2) {
        return param1 * param2;
    }
}
