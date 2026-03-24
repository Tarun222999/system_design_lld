package lldquestions.parkinglot.paymentstrategy.concrete.credit;

import lldquestions.parkinglot.paymentstrategy.IStrategy;

public class CreditPayment implements IStrategy {
    public CreditPayment(double fee) {
    }

    public void processPayment(double amount) {
        System.out.println("process amount" + amount);
    }
}
