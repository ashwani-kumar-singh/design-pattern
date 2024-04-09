package behavioral.mediator;

public interface Colleague {
    void placeBid(int bidAmount);
    void notifyBidders(int bidAmount);
    String getName();
}
