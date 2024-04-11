package structural.flyweight.robot;

import structural.flyweight.RobotType;

public class DogRobot implements IRobot {
    RobotType type;

    // very large object
    String body;

    public DogRobot(RobotType type, String body) {
        this.type = type;
        this.body = body;
    }

    @Override
    public void display(int xAxis, int yAxis) {
        System.out.println("Position of Human Robot: " + "( " + xAxis + " , " + yAxis + ")");
    }
}
