import concrete.CreditCard;
import concrete.Paypal;
import processor.PaymentProcessor;
import strategy.PaymentStragey;

public class Main {
    public static void main(String[] args) {
        PaymentStragey creditCard = new CreditCard();
        PaymentStragey payPal = new Paypal();
        PaymentProcessor paymentProcessor = new PaymentProcessor(creditCard);
        paymentProcessor.processPayment();
        paymentProcessor.setPaymentStrategy(payPal);
        paymentProcessor.processPayment();
    }
}
