package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Auction implements AuctionMediator {
    List<Colleague> bidders = new ArrayList<>();

    @Override
    public void placeBid(Bidder bidder, int bidAmount) {
        bidders.forEach(bid -> {
            if (!Objects.equals(bid.getName(), bidder.getName())) {
                bid.notifyBidders(bidAmount);
            }
        });
    }

    @Override
    public void addBidder(Bidder bidder) {
        bidders.add(bidder);
    }
}
