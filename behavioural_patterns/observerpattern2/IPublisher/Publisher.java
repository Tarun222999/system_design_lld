package observerpattern2.IPublisher;

import observerpattern2.ISubscriber.Subscriber;

public interface Publisher {
    public void addSubscriber(Subscriber subscriber);

    public void deleteSubscriber(Subscriber subscriber);

    public void updateScore();

    public void updateHighlight();
}
