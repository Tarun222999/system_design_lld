package processor;

import strategy.PaymentStragey;

public class PaymentProcessor {
    private PaymentStragey paymentStrategy;

    public PaymentProcessor(PaymentStragey paymentStragey) {
        this.paymentStrategy = paymentStragey;
    }

    public void processPayment() {
        paymentStrategy.processPayment();
    }

    public void setPaymentStrategy(PaymentStragey paymentStragey) {
        this.paymentStrategy = paymentStragey;
    }
}
