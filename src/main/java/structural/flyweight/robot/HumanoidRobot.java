package structural.flyweight.robot;

import structural.flyweight.RobotType;

public class HumanoidRobot implements IRobot {

    RobotType type;

    // very large object
    String body;

    public HumanoidRobot(RobotType type, String body) {
        this.type = type;
        this.body = body;
    }

    @Override
    public void display(int xAxis, int yAxis) {
        System.out.println("Position of Human Robot: " + "( " + xAxis + " , " + yAxis + ")");
    }

}
