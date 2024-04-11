package structural.flyweight;

import structural.flyweight.robot.DogRobot;
import structural.flyweight.robot.HumanoidRobot;
import structural.flyweight.robot.IRobot;

import java.util.HashMap;
import java.util.Map;

public class RoboticFactory {
    static private final Map<RobotType, IRobot> roboticCache = new HashMap<>();

    static IRobot createRobot(RobotType robotType) {
        if (!roboticCache.containsKey(robotType)) {
            if (RobotType.HUMANOID.equals(robotType)) {
                roboticCache.put(robotType, new HumanoidRobot(robotType, "large string object"));
            }

            if (RobotType.ROBOTIC_DOG.equals(robotType)) {
                roboticCache.put(robotType, new DogRobot(robotType, "large string object"));
            }
        } else {
            System.out.println(robotType + " found in the cache");
        }
        return roboticCache.get(robotType);
    }

}
