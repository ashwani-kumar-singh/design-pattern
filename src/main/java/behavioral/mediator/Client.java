package behavioral.mediator;

/**
 * Mediator Design Pattern: It encourages loose coupling by keeping objects from referring to each other
 * explicitly and allows them to communicate each other through a mediator object.
 *
 * @link: <a href="https://www.geeksforgeeks.org/mediator-design-pattern/">...</a>
 *
 */
public class Client {
    public static void main(String[] args) {

        AuctionMediator mediator = new Auction();
        Bidder bidder1 = new Bidder("Alex", mediator);
        Bidder bidder2 = new Bidder("Zen", mediator);
        Bidder bidder3 = new Bidder("Madrin", mediator);
        System.out.println("***************************** Alex Bid *************************");
        bidder1.placeBid(12000);
        System.out.println("***************************** Zen Bid *************************");
        bidder2.placeBid( 45000);
        System.out.println("***************************** Madrin Bid *************************");
        bidder3.placeBid( 456000);

    }
}
