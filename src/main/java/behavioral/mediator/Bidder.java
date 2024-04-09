package behavioral.mediator;

public class Bidder implements Colleague {
    private final String name;
    private final AuctionMediator mediator;

    public Bidder(String name, AuctionMediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.addBidder(this);
    }

    @Override
    public void placeBid(int bidAmount) {
        mediator.placeBid(this, bidAmount);
    }

    @Override
    public void notifyBidders(int bidAmount) {
        System.out.println("Bidder: " +  name + " got the notification someone put the bid " +
                "of amount: " + bidAmount);
    }

    @Override
    public String getName() {
        return name;
    }
}
