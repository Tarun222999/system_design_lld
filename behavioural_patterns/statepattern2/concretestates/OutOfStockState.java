package statepattern2.concretestates;

import statepattern2.context.VendingMeachineContext;
import statepattern2.istate.VendingMeachineState;

public class OutOfStockState implements VendingMeachineState {

    public void insertMoney(VendingMeachineContext context, int amount) {
        System.out.println("Purchase blocked: selected item is out of stock");
    }

    public void selectItem(VendingMeachineContext context, String code) {
        System.out.println("Purchase blocked: selected item is out of stock");
    }

    public void dispense(VendingMeachineContext context) {
        System.out.println("Cannot dispense: item out of stock");
    }

    public void refund(VendingMeachineContext context) {
        if (context.balance == 0) {
            System.out.println("No balance to refund");
            context.setState(new Idlestate());
            return;
        }

        System.out.println("Money refunded: " + context.balance);
        context.balance = 0;
        context.selecteditem = null;
        context.setState(new Idlestate());
    }
}
