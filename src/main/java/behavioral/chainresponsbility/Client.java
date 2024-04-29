package behavioral.chainresponsbility;

/**
 * Behavioral Design Pattern: It guides how different object communicate with each other effectively and
 * distribute task efficiently, making software flexible and easy to maintain.
 *
 * Chain Responsibility Principle: It allows an object to pass a request along a chain of handlers.
 * Each handler in the chain decides either to process the request or to pass it along the chain
 * to the next handler.
 *
 * @link: <a href="https://www.geeksforgeeks.org/chain-responsibility-design-pattern/">...</a>
 */
public class Client {
    public static void main(String[] args) {
        SupportHandler level1Handler = new Level1SupportHandler();
        SupportHandler level2Handler = new Level2SupportHandler();
        SupportHandler level3Handler = new Level3SupportHandler();

        level1Handler.setNextHandler(level2Handler);
        level2Handler.setNextHandler(level3Handler);

        level1Handler.handle(new Request(Priority.BASIC));
        level1Handler.handle(new Request(Priority.INTERMEDIATE));
        level1Handler.handle(new Request(Priority.CRITICAL));

    }
}
