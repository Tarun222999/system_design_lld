package mediatorpattern.concretemediator;

import mediatorpattern.bidder.Bidder;

public class ExtendedAuctionHouse extends AuctionHouse {
    private long biddingEndTime;

    public ExtendedAuctionHouse(long biddingEndTime) {
        this.biddingEndTime = biddingEndTime;
    }

    public void placeBid(Bidder bidder, int amount) {
        // check if bidding time is still open
        if (System.currentTimeMillis() > biddingEndTime) {
            System.out.println("Bidding time is over. No more bids accepted.");
            return;
        }

        // Log the bid
        System.out.println("LOG: " + bidder.getName() + " is bidding " + amount);

        super.placeBid(bidder, amount);
    }

}
