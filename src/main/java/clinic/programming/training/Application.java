package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {

    public int countWords(String words) {
        String[] SeparateWords = StringUtils.split(words, ' ');
        return (SeparateWords == null) ? 0 : SeparateWords.length;
    }

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
      System.out.println( "Word count: " + app.countWords("dis be four words") );
    }
}
