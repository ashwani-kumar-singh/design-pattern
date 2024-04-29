package structural.flyweight.robot;

public class HumanoidRobot implements IRobot {
    // very large object
    String body;

    public HumanoidRobot(String body) {
        this.body = body;
    }

    @Override
    public void display(int xAxis, int yAxis) {
        System.out.println("Position of Human Robot: " + "( " + xAxis + " , " + yAxis + ")");
    }


}
