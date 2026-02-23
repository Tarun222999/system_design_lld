package chainofresponsibility2;

import chainofresponsibility2.concretesupport.L1Support;
import chainofresponsibility2.concretesupport.L2Support;
import chainofresponsibility2.concretesupport.Security;
import chainofresponsibility2.concretesupport.Supervisor;
import chainofresponsibility2.support.Support;
import chainofresponsibility2.ticket.Ticket;

public class Main {
    public static void main(String[] args) {
        Support l1 = new L1Support();
        Support l2 = new L2Support();
        Support supervisor = new Supervisor();
        Support security = new Security();

        l1.setNext(l2);
        l2.setNext(supervisor);
        supervisor.setNext(security);

        Ticket t1 = new Ticket(101, "BILLING", "LOW", "Refund status");
        Ticket t2 = new Ticket(102, "TECHNICAL", "MEDIUM", "App crash on login");
        Ticket t3 = new Ticket(103, "ACCOUNT", "HIGH", "Account locked repeatedly");
        Ticket t4 = new Ticket(104, "SECURITY", "CRITICAL", "Suspicious admin access");
        Ticket t5 = new Ticket(105, "BILLING", "MEDIUM", "Promo code mismatch");

        l1.handle(t1);
        l1.handle(t2);
        l1.handle(t3);
        l1.handle(t4);
        l1.handle(t5);
    }
}
