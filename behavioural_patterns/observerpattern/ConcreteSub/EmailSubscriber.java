package observerpattern.ConcreteSub;

import observerpattern.ISubscriber.Subscriber;

public class EmailSubscriber implements Subscriber {
    String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    public void notifySubscriber() {
        System.out.println("notifying the user of new video" + email);
    }
}
