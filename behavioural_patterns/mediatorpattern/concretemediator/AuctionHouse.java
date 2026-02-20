package mediatorpattern.concretemediator;

import java.util.ArrayList;
import java.util.List;

import mediatorpattern.bidder.Bidder;
import mediatorpattern.imediator.AuctionMediator;

public class AuctionHouse implements AuctionMediator {
    private List<Bidder> bidders = new ArrayList<>();

    public void registerBidder(Bidder bidder) {
        bidders.add(bidder);
    }

    public void placeBid(Bidder bidder, int amount) {
        System.out.println(bidder.getName() + " place bid of " + amount);
        for (Bidder b : bidders) {
            if (b != bidder) {
                b.receievedBid(bidder, amount);
            }
        }
    }

}
