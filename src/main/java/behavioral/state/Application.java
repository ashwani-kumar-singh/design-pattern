package behavioral.state;

/**
 * Behavioral Design Pattern : It guides how different object communicate with each other effectively and
 * distribute task efficiently, making software flexible and easy to maintain.
 * <p>
 * State Design Pattern: Allows an object to alter it's behaviour when it's internal state changes
 */
public class Application {

    public static void main(String[] args) {
        Package pkg = new Package();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();
    }
}
