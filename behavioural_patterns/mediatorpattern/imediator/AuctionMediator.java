package mediatorpattern.imediator;

import mediatorpattern.bidder.Bidder;

public interface AuctionMediator {
    void registerBidder(Bidder bidder);

    void placeBid(Bidder bidder, int amount);
}
