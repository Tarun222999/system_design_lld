package chainofresponsibility.concrete;

import chainofresponsibility.approver.Approver;

public class Manager extends Approver {
    public void processLeave(int leavedays) {
        if (leavedays <= 3) {
            System.out.println("leave approved by manager");
        } else if (this.nextApprover != null) {
            nextApprover.processLeave(leavedays);
        }
    }
}