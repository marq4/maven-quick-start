package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public void greet() {
        List<String> Greetings = new ArrayList<>();
        Greetings.add("Hello");
        for (String greeting : Greetings)
          System.out.println("Greeting: " + greeting);
    }
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	    Application app = new Application();
      app.greet();
    }
}
