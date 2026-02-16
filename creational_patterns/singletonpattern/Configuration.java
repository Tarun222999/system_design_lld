package singletonpattern;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Configuration {
    private static volatile Configuration instance = null;
    private final Map<String, String> config;

    private Configuration(Map<String, String> feed) {
        // feed the config
        // “We create a defensive copy of the input map and wrap it in an unmodifiable
        // view to ensure configuration data remains immutable.”
        this.config = Collections.unmodifiableMap(new HashMap<>(feed));
    }

    public static void initialize(Map<String, String> feed) {
        if (instance == null) {
            synchronized (Configuration.class) {
                if (instance == null) {
                    instance = new Configuration(feed);
                }
            }
        }
    }

    // get instance just to get the instance *****
    // use one another method if u want to intialize
    public static Configuration getInstance() {
        if (instance == null) {
            throw new IllegalStateException("Not intialized");
        }
        return instance;
    }

    public String getValue(String key) {
        return config.get(key);
    }

}
