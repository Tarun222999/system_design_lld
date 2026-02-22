package statepattern2;

import statepattern2.context.VendingMeachineContext;

public class Main {
    public static void main(String[] args) {
        VendingMeachineContext machine = new VendingMeachineContext();
        machine.addItem("COKE", 2, 40);
        machine.addItem("CHIPS", 1, 30);

        System.out.println("=== Flow 1: Valid purchase ===");
        machine.insertMoney(50);
        machine.selectItem("COKE");
        machine.dispense();

        System.out.println("=== Flow 2: Insufficient balance ===");
        machine.insertMoney(10);
        machine.selectItem("COKE");
        machine.refund();

        System.out.println("=== Flow 3: Out of stock ===");
        machine.insertMoney(30);
        machine.selectItem("CHIPS");
        machine.dispense();

        machine.insertMoney(30);
        machine.selectItem("CHIPS");
        machine.refund();

        System.out.println("=== Flow 4: Refund ===");
        machine.insertMoney(25);
        machine.refund();
    }
}
