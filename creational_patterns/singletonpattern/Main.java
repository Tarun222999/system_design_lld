package singletonpattern;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> feed = new HashMap<>();
        feed.put("db.url", "psql:5433");
        feed.put("env", "dev");

        Configuration.initialize(feed);
        Configuration c1 = Configuration.getInstance();
        Configuration c2 = Configuration.getInstance();
        System.out.println(c1 == c2);// true
        // System.out.println(c1.getValue("env")); // add getValue() in Configuration
        // first

    }
}
