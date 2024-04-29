package structural.flyweight;

import structural.flyweight.robot.DogRobot;
import structural.flyweight.robot.HumanoidRobot;
import structural.flyweight.robot.IRobot;

import java.util.HashMap;
import java.util.Map;

public class RoboticFactory {
    static private final Map<RobotType, IRobot> ROBOTIC_CACHE = new HashMap<>();

    static IRobot createRobot(RobotType robotType) {
        if (!ROBOTIC_CACHE.containsKey(robotType)) {
            if (RobotType.HUMANOID.equals(robotType)) {
                ROBOTIC_CACHE.put(robotType, new HumanoidRobot("large string object"));
            }
            if (RobotType.ROBOTIC_DOG.equals(robotType)) {
                ROBOTIC_CACHE.put(robotType, new DogRobot("large string object"));
            }
        } else {
            System.out.println(robotType + " found in the cache");
        }
        return ROBOTIC_CACHE.get(robotType);
    }

}
