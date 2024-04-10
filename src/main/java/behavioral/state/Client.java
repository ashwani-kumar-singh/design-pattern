package behavioral.state;

/**
 * Behavioral Design Pattern : It guides how different object communicate with each other effectively and
 * distribute task efficiently, making software flexible and easy to maintain.
 *
 * State Design Pattern: Allows an object to alter it's behaviour when it's internal state changes
 *
 * @link: <a href="https://www.geeksforgeeks.org/state-design-pattern/">...</a>
 */
public class Client {

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
