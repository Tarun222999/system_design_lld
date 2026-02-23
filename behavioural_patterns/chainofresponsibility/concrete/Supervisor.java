package chainofresponsibility.concrete;

import chainofresponsibility.approver.Approver;

public class Supervisor extends Approver {

    public void processLeave(int leavedays) {
        if (leavedays <= 3) {
            System.out.println("leave approved by supervisor");
        } else if (this.nextApprover != null) {
            nextApprover.processLeave(leavedays);
        }
    }
}
