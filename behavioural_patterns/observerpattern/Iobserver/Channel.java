package observerpattern.Iobserver;

import observerpattern.ISubscriber.Subscriber;

public interface Channel {
    void addSubscriber(Subscriber subscriber);

    void deleteSubscriber(Subscriber subscriber);

    void sendNotification();

}
