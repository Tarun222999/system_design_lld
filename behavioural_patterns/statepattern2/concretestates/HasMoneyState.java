package statepattern2.concretestates;

import statepattern2.context.VendingMeachineContext;
import statepattern2.istate.VendingMeachineState;

public class HasMoneyState implements VendingMeachineState {

    public void insertMoney(VendingMeachineContext context, int amount) {
        context.balance = context.balance + amount;
    }

    public void selectItem(VendingMeachineContext context, String code) {
        Integer quantity = context.inventory.get(code);
        if (quantity == null || quantity == 0) {
            context.selecteditem = null;
            context.setState(new OutOfStockState());
            System.out.println("Out of stock: " + code);
            return;
        }

        Integer price = context.cost.get(code);
        if (price == null) {
            context.selecteditem = null;
            System.out.println("Invalid item: " + code);
            return;
        }

        if (price > context.balance) {
            context.selecteditem = null;
            System.out.println("Balance insufficient, please add money or choose another item");
            return;
        }

        context.selecteditem = code;
        System.out.println("Item selected: " + code);
    }

    public void dispense(VendingMeachineContext context) {
        if (context.selecteditem == null) {
            System.out.println("Please select item first");
            return;
        }

        context.setState(new DispensingState());
        context.dispense();
    }

    public void refund(VendingMeachineContext context) {
        if (context.balance == 0) {
            System.out.println("No balance to refund");
            context.setState(new Idlestate());
            return;
        }

        System.out.println("Balance refunded: " + context.balance);
        context.balance = 0;
        context.selecteditem = null;
        context.setState(new Idlestate());
    }
}
