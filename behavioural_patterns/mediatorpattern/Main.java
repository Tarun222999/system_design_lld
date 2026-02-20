package mediatorpattern;

import mediatorpattern.bidder.Bidder;
import mediatorpattern.imediator.AuctionMediator;
import mediatorpattern.concretemediator.ExtendedAuctionHouse;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long biddingEndTime = System.currentTimeMillis() + 5000;
        AuctionMediator auctionHouse = new ExtendedAuctionHouse(biddingEndTime);
        Bidder bidder1 = new Bidder("Alice", auctionHouse);
        Bidder bidder2 = new Bidder("Roy", auctionHouse);
        Bidder bidder3 = new Bidder("Charlie", auctionHouse);

        auctionHouse.registerBidder(bidder3);
        auctionHouse.registerBidder(bidder1);
        auctionHouse.registerBidder(bidder2);

        bidder1.placeBid(500);
        Thread.sleep(2000);
        bidder2.placeBid(7000);
        Thread.sleep(400);
        // bid will not be placed
        bidder3.placeBid(123);

    }
}
