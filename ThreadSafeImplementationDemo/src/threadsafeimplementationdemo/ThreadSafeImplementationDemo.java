package threadsafeimplementationdemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

public class ThreadSafeImplementationDemo {

    private static final AtomicReference<ThreadSafeImplementationDemo> INSTANCE = new AtomicReference<>();
    private final HashMap<String, String> config = new HashMap<>();

    private ThreadSafeImplementationDemo() {
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

    public static ThreadSafeImplementationDemo getInstance() {
        INSTANCE.compareAndSet(null, new ThreadSafeImplementationDemo());
        return INSTANCE.get();
    }
}

   

