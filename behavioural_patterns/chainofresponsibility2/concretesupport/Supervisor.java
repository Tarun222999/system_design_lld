package chainofresponsibility2.concretesupport;

import chainofresponsibility2.support.Support;
import chainofresponsibility2.ticket.Ticket;

public class Supervisor extends Support {
    public void handle(Ticket ticket) {
        boolean isHigh = ticket.severity.equals("HIGH");
        boolean isSecurity = ticket.issueType.equals("SECURITY");

        if (isHigh && !isSecurity) {
            System.out.println("Supervisor handled ticket " + ticket.ticketId);
            return;
        }

        forwardOrReject(ticket);
    }
}
