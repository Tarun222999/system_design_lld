package chainofresponsibility2.ticket;

public class Ticket {
    public int ticketId;
    public String issueType;
    public String severity;
    public String description;

    public Ticket(int ticketId,
            String issueType,
            String severity,
            String description) {
        this.ticketId = ticketId;
        this.issueType = issueType;
        this.severity = severity;
        this.description = description;
    }
}
