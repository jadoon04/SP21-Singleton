package Wikipedia_Examples;

    
    public class Singleton_Example2{
  
    private static final Singleton_Example2 instance = new Singleton_Example2();
    private int value;

    private Singleton_Example2() {
        // Private constructor to prevent instantiation from outside
    }

    public static Singleton_Example2 get() {
        // Return the single instance of Singleton
        return instance;
    }

    // Existing interface methods go here
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
        
        
    }
    
  
