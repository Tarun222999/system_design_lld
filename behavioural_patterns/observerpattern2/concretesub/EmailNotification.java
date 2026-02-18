package observerpattern2.concretesub;

import observerpattern2.ISubscriber.Subscriber;

public class EmailNotification implements Subscriber {
    public String email;
    public String event;

    public EmailNotification(String email) {
        this.email = email;
    }

    public void notifyUser(String event) {
        System.out.println("Email notification sent" + email);
    }
}
