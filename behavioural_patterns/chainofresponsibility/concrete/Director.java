package chainofresponsibility.concrete;

import chainofresponsibility.approver.Approver;

public class Director extends Approver {

    public void processLeave(int leavedays) {
        if (leavedays <= 3) {
            System.out.println("leave approved by director");
        } else if (this.nextApprover != null) {
            nextApprover.processLeave(leavedays);
        }
    }
}
