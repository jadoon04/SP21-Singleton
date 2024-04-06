package Github_Example2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.HashMap;

public class Configuration {
    private static volatile Configuration instance;
    private final HashMap<String, String> config = new HashMap<>();

    private Configuration() {
        try (FileInputStream fileInput = new FileInputStream("C:\\Users\\malik\\Documents\\NetBeansProjects\\Singleton_Pattern\\src\\Github_Example2\\config.properties")) {
            Properties properties = new Properties();
            properties.load(fileInput);
            Enumeration<Object> enuKeys = properties.keys();
            while (enuKeys.hasMoreElements()) {
                String key = (String) enuKeys.nextElement();
                String value = properties.getProperty(key);
                config.put(key, value);
            }
        } catch (IOException e) {
            // Handle IOException appropriately, e.g., log or throw a custom exception
            e.printStackTrace();
        }
    }

    public String getValue(String key) {
        return config.get(key);
    }

    public static Configuration getInstance() {
        if (instance == null) {
            synchronized (Configuration.class) {
                if (instance == null) {
                    instance = new Configuration();
                }
            }
        }
        return instance;
    }
}


