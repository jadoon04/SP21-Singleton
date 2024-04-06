package Github_Example2;


public class Demo {
    public static void main(String[] args) {
        // Get the singleton instance of Configuration
        Configuration config = Configuration.getInstance();
        
        // Access and print values from the configuration
        System.out.println("Mode: " + config.getValue("mode"));
        System.out.println("Font Size: " + config.getValue("font-size"));
        System.out.println("Font Type: " + config.getValue("font-type"));
    }
}
