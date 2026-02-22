package statepattern2.concretestates;

import statepattern2.context.VendingMeachineContext;
import statepattern2.istate.VendingMeachineState;

public class DispensingState implements VendingMeachineState {

    public void insertMoney(VendingMeachineContext context, int amount) {
        System.out.println("Not possible while dispensing");
    }

    public void selectItem(VendingMeachineContext context, String code) {
        System.out.println("Not possible while dispensing");
    }

    public void dispense(VendingMeachineContext context) {
        String itemCode = context.selecteditem;
        if (itemCode == null) {
            System.out.println("No item selected");
            context.setState(new HasMoneyState());
            return;
        }

        Integer quantity = context.inventory.get(itemCode);
        Integer price = context.cost.get(itemCode);

        if (quantity == null || quantity == 0) {
            System.out.println("Item out of stock: " + itemCode);
            context.setState(new OutOfStockState());
            return;
        }

        if (price == null) {
            System.out.println("Invalid item configuration: " + itemCode);
            context.selecteditem = null;
            context.setState(new HasMoneyState());
            return;
        }

        if (context.balance < price) {
            System.out.println("Insufficient balance for: " + itemCode);
            context.selecteditem = null;
            context.setState(new HasMoneyState());
            return;
        }

        context.inventory.put(itemCode, quantity - 1);
        context.balance = context.balance - price;
        context.selecteditem = null;

        System.out.println("Item dispensed: " + itemCode);
        System.out.println("Remaining balance: " + context.balance);

        if (context.balance > 0) {
            context.setState(new HasMoneyState());
        } else {
            context.setState(new Idlestate());
        }
    }

    public void refund(VendingMeachineContext context) {
        System.out.println("Not possible while dispensing");
    }
}
