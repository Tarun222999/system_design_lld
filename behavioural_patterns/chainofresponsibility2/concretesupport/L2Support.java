package chainofresponsibility2.concretesupport;

import chainofresponsibility2.support.Support;
import chainofresponsibility2.ticket.Ticket;

public class L2Support extends Support {

    public void handle(Ticket ticket) {
        boolean isMedium = ticket.severity.equals("MEDIUM");
        boolean isTechOrAccount = ticket.issueType.equals("TECHNICAL") || ticket.issueType.equals("ACCOUNT");

        if (isMedium && isTechOrAccount) {
            System.out.println("L2 handled ticket " + ticket.ticketId);
            return;
        }

        forwardOrReject(ticket);
    }
}
