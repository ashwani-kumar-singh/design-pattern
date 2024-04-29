package structural.flyweight;

import structural.flyweight.robot.IRobot;

/**
 * Flyweight Design Pattern: Flyweight pattern is used when we need to create a large number of
 * similar objects. This pattern helps to reduce memory usage by sharing data among multiple objects.
 *
 * One important feature of flyweight objects is that they are immutable. This means that they
 * cannot be modified once they have been constructed.
 *
 * Intrinsic Data: Shared among objects and remain same once defined one value.
 * Extrinsic Data: Change based on client input and differs from one object to another.
 */
public class Client {

    public static void main(String[] args) {
        IRobot robot = RoboticFactory.createRobot(RobotType.ROBOTIC_DOG);
        System.out.println("********** Robotic Dog Call **************");
        robot.display(12, 3);
        System.out.println("********** Second Dog Call **************");
        robot = RoboticFactory.createRobot(RobotType.ROBOTIC_DOG);
        robot.display(5, 12);

        robot = RoboticFactory.createRobot(RobotType.HUMANOID);
        System.out.println("********** Humanoid Robot Call **************");
        robot.display(12, 3);
        System.out.println("********** Second Humanoid Robot Call **************");
        robot = RoboticFactory.createRobot(RobotType.HUMANOID);
        robot.display(15, 30);
    }
}
