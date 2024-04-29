package structural.flyweight.robot;

import structural.flyweight.RobotType;

public class DogRobot implements IRobot {
    // very large object
    String body;

    public DogRobot(String body) {
        this.body = body;
    }

    @Override
    public void display(int xAxis, int yAxis) {
        System.out.println("Position of Human Robot: " + "( " + xAxis + " , " + yAxis + ")");
    }
}
