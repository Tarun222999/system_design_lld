package observerpattern2.concretesub;

import observerpattern2.ISubscriber.Subscriber;

public class InAppNotification implements Subscriber {
    public Integer ip;;
    public String event;

    public InAppNotification(Integer ip) {
        this.ip = ip;
    }

    public void notifyUser(String event) {
        System.out.println("InApp notification sent" + ip);
    }
}