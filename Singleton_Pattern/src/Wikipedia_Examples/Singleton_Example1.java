package Wikipedia_Examples;


    
    public class Singleton_Example1{
     
    private static Singleton_Example1 instance;
    private int value;

    private Singleton_Example1() {
        
    }

    public static synchronized Singleton_Example1 getInstance() {
        
        if (instance == null) {
            instance = new Singleton_Example1();
        }
        return instance;
    }
    

    public static void destruct() {
       
        instance = null;
    }

 
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
        
    }
    
  

