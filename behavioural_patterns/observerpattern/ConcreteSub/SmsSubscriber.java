package observerpattern.ConcreteSub;

import observerpattern.ISubscriber.Subscriber;

public class SmsSubscriber implements Subscriber {
    Integer number;

    public SmsSubscriber(Integer number) {
        this.number = number;
    }

    public void notifySubscriber() {
        System.out.println("sent an sms to the " + number);
    }
}
