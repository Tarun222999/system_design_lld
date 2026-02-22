package statepattern2.concretestates;

import statepattern2.context.VendingMeachineContext;
import statepattern2.istate.VendingMeachineState;

public class Idlestate implements VendingMeachineState {

    public void insertMoney(VendingMeachineContext context, int amount) {
        context.balance = context.balance + amount;
        context.setState(new HasMoneyState());
    }

    public void selectItem(VendingMeachineContext context, String code) {
        System.out.println("No Balance");
    }

    public void dispense(VendingMeachineContext context) {
        System.out.println("No Balance");
    }

    public void refund(VendingMeachineContext context) {
        System.out.println("No Balance");
    }
}
