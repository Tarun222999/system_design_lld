package chainofresponsibility2.concretesupport;

import chainofresponsibility2.support.Support;
import chainofresponsibility2.ticket.Ticket;

public class L1Support extends Support {
    public void handle(Ticket ticket) {
        if (ticket.severity.equals("LOW")) {
            System.out.println("L1 handled ticket " + ticket.ticketId);
            return;
        }

        forwardOrReject(ticket);
    }
}
