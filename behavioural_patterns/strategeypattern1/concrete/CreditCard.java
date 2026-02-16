package concrete;

import strategy.PaymentStragey;

public class CreditCard implements PaymentStragey {
    public void processPayment() {
        System.out.println("Credit card payment ...");
    }
}
