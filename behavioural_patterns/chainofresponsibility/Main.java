package chainofresponsibility;

import chainofresponsibility.approver.Approver;
import chainofresponsibility.concrete.Director;
import chainofresponsibility.concrete.Manager;
import chainofresponsibility.concrete.Supervisor;

public class Main {
    public static void main(String[] args) {
        Approver supervisor = new Supervisor();
        Approver director = new Director();
        Approver manager = new Manager();

        supervisor.setNextApprover(manager);
        manager.setNextApprover(director);

        int leaveDays = 10;
        System.out.println("Employee requests " + leaveDays + " days of leave.");
        supervisor.processLeave(leaveDays);
    }
}
