package behavioral.chainresponsbility;

/**
 * Chain Responsibility Principle: It allows an object to pass a request along a chain of handlers.
 * Each handler in the chain decides either to process the request or to pass it along the chain
 * to the next handler.
 *
 * @link: https://www.geeksforgeeks.org/chain-responsibility-design-pattern/
 */
public class Application {
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
