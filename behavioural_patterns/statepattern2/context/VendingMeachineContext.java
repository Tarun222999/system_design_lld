package statepattern2.context;

import java.util.HashMap;
import java.util.Map;

import statepattern2.concretestates.Idlestate;
import statepattern2.istate.VendingMeachineState;

public class VendingMeachineContext {
    public VendingMeachineState state;
    public int balance;
    public String selecteditem;
    public Map<String, Integer> inventory = new HashMap<>();
    public Map<String, Integer> cost = new HashMap<>();

    public VendingMeachineContext() {
        this.balance = 0;
        state = new Idlestate();
    }

    public void addItem(String item, int qty, int amount) {
        inventory.put(item, qty);
        cost.put(item, amount);
    }

    public void insertMoney(int amount) {
        state.insertMoney(this, amount);
    }

    public int getBalance() {
        return this.balance;
    }

    public void selectItem(String code) {
        state.selectItem(this, code);
    }

    public void dispense() {
        state.dispense(this);
    }

    public void refund() {
        state.refund(this);
    }

    public void setState(VendingMeachineState nextstate) {
        this.state = nextstate;
    }

}
