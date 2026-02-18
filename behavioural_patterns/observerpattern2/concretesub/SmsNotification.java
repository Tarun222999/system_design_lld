package observerpattern2.concretesub;

import observerpattern2.ISubscriber.Subscriber;

public class SmsNotification implements Subscriber {
    public Integer number;
    public String event;

    public SmsNotification(Integer number) {
        this.number = number;
    }

    public void notifyUser(String event) {
        System.out.println("Sms notification sent" + number);
    }
}
