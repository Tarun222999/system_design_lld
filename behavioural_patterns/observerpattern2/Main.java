package observerpattern2;

import observerpattern2.ISubscriber.Subscriber;
import observerpattern2.concretepub.CricBuzz;
import observerpattern2.concretesub.EmailNotification;
import observerpattern2.concretesub.InAppNotification;
import observerpattern2.concretesub.SmsNotification;

public class Main {
    public static void main(String[] args) {
        Subscriber s1 = new EmailNotification("test@gmail.com");
        Subscriber s2 = new SmsNotification(3404093);
        Subscriber s3 = new InAppNotification(192);

        CricBuzz cb = new CricBuzz();
        cb.addSubscriber(s3);
        cb.addSubscriber(s1);
        cb.addSubscriber(s2);

        cb.setBallScore("4");
        cb.setHighlight("13.4 caughtout");

        cb.deleteSubscriber(s2);

        cb.setHighlight("19.4 six");

    }

}
