package chainofresponsibility2.support;

import chainofresponsibility2.ticket.Ticket;

public abstract class Support {
    protected Support nextlevel;

    public void setNext(Support nextlevel) {
        this.nextlevel = nextlevel;
    }

    protected void forwardOrReject(Ticket ticket) {
        if (nextlevel != null) {
            nextlevel.handle(ticket);
            return;
        }
        System.out.println("No handler available for ticket " + ticket.ticketId);
    }

    public abstract void handle(Ticket ticket);
}
