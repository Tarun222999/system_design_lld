package observerpattern;

import observerpattern.ISubscriber.Subscriber;
import observerpattern.ConcretePub.YoutubeChannel;
import observerpattern.ConcreteSub.EmailSubscriber;
import observerpattern.ConcreteSub.PushSubscriber;
import observerpattern.ConcreteSub.SmsSubscriber;

public class Main {
    public static void main(String[] args) {
        Subscriber s1 = new EmailSubscriber("user@gmail.com");
        Subscriber s2 = new PushSubscriber("1234");
        Subscriber s3 = new SmsSubscriber(93403409);

        YoutubeChannel publisher = new YoutubeChannel();
        publisher.addSubscriber(s2);
        publisher.addSubscriber(s1);

        publisher.saveVideo("daredevil");

        publisher.deleteSubscriber(s1);
        publisher.addSubscriber(s3);

        publisher.saveVideo("born again");
    }

}
