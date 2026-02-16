package concrete;

import strategy.PaymentStragey;

public class Paypal implements PaymentStragey {
    public void processPayment() {
        System.out.println("Paypal card payment ...");
    }
}
