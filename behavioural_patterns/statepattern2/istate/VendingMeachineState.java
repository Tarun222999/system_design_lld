package statepattern2.istate;

import statepattern2.context.VendingMeachineContext;

public interface VendingMeachineState {
    void insertMoney(VendingMeachineContext context, int amount);

    void selectItem(VendingMeachineContext context, String code);

    void dispense(VendingMeachineContext context);

    void refund(VendingMeachineContext context);
}
