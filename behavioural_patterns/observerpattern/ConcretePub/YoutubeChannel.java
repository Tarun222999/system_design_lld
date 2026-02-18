package observerpattern.ConcretePub;

import java.util.ArrayList;
import java.util.List;

import observerpattern.ISubscriber.Subscriber;
import observerpattern.Iobserver.Channel;

public class YoutubeChannel implements Channel {
    public List<Subscriber> subscribers = new ArrayList<>();

    public String video;

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void deleteSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void sendNotification() {

        for (Subscriber sub : subscribers) {
            sub.notifySubscriber();
        }

    }

    public void saveVideo(String video) {
        this.video = video;
        sendNotification();
    }

}
