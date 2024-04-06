package Wikipedia_Examples;

    
    public class Singleton_Example3{
    private int value;
    
    private static volatile Singleton_Example3 instance;
    
    private Singleton_Example3() {
    //        EMPTY CONSTRUCTOR
    }

    public static Singleton_Example3 getInstance() {
         if (instance == null) {
            synchronized (Singleton_Example3.class) {
                if (instance == null) {
                    instance = new Singleton_Example3();
                }
            }
        }
        return instance;
    }
    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
  
    }
    
  

