import java.lang.reflect.Array;
import java.util.*;

public class PersonneMain {

    public static void main(String[] args) {
        //dog
        dog d = new dog("snoopy");
        dog d1 = new dog("scooby doo");
        d1.greets(d1);
        d1.aanimal();
        //cat
        cat a = new cat("suamoi");
        a.greets();
        //mammal
        mammal m = new mammal("cow");
        m.aanimal();

    }
}



