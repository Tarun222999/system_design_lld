package observerpattern2.concretepub;

import java.util.ArrayList;
import java.util.List;

import observerpattern2.IPublisher.Publisher;
import observerpattern2.ISubscriber.Subscriber;

public class CricBuzz implements Publisher {
    List<Subscriber> subscribers = new ArrayList<>();
    public String ballscore;
    public String highlight;

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void deleteSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void setHighlight(String h) {
        this.highlight = h;
        updateHighlight();
    }

    public void setBallScore(String s) {
        this.ballscore = s;
        updateScore();
    }

    public void updateScore() {
        for (Subscriber sub : subscribers) {
            sub.notifyUser(ballscore);
        }
    };

    public void updateHighlight() {
        for (Subscriber sub : subscribers) {
            sub.notifyUser(highlight);
        }
    };

}
