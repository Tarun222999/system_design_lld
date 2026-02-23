package chainofresponsibility2.concretesupport;

import chainofresponsibility2.support.Support;
import chainofresponsibility2.ticket.Ticket;

public class Security extends Support {
    public void handle(Ticket ticket) {
        boolean isSecurityIssue = ticket.issueType.equals("SECURITY");
        boolean isCritical = ticket.severity.equals("CRITICAL");

        if (isSecurityIssue || isCritical) {
            System.out.println("Security handled ticket " + ticket.ticketId);
            return;
        }

        forwardOrReject(ticket);
    }
}
