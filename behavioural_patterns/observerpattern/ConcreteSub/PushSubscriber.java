package observerpattern.ConcreteSub;

import observerpattern.ISubscriber.Subscriber;

public class PushSubscriber implements Subscriber {
    String id;

    public PushSubscriber(String id) {
        this.id = id;
    }

    public void notifySubscriber() {
        System.out.println("notify subscriber through push" + id);
    }

}
