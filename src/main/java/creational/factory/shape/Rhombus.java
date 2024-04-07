package creational.factory.shape;

public class Rhombus implements Shape {
    @Override
    public double computeArea(float param1, float param2) {
        return 0.5 * param1 * param2;
    }
}
