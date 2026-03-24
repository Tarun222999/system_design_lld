package lldquestions.parkinglot.paymentstrategy.concrete.cash;

import lldquestions.parkinglot.paymentstrategy.IStrategy;

public class CashPayment implements IStrategy {
    public CashPayment(double fee) {
    }

    public void processPayment(double amount) {
        System.out.println("process amount" + amount);
    }
}
