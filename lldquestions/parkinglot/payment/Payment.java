package lldquestions.parkinglot.payment;

import lldquestions.parkinglot.paymentstrategy.IStrategy;

public class Payment {
    private double amount;
    private IStrategy paymentStrategy;

    public Payment(double amount, IStrategy paymentStrategy) {
        this.amount = amount;
        this.paymentStrategy = paymentStrategy;
    }

    public void proccessPayment() {
        if (amount > 0) {
            paymentStrategy.processPayment(amount);
        } else {
            System.out.println("Invalid payment request");
        }
    }
}
