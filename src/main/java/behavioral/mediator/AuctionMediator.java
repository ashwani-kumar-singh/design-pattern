package behavioral.mediator;

public interface AuctionMediator {

    void placeBid(Bidder bidder, int bidAmount);

    void addBidder(Bidder bidder);
}
