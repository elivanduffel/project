package my_app;

/**
 * Created by java on 24.09.15.
 */
public class JavaApp {

    public static void main(String[] args) {
        Dog aDog = new Dog("Max");
        foo(aDog);

        if (aDog.getDog().equals("Max")) { //true
            System.out.println("Java passes by value, Eli.");

        } else if (aDog.getDog().equals("Fifi")) {
            System.out.println("Java passes by reference, Eli.");
        }
    }

    public static void foo(Dog d) {
        d.getDog().equals("Max"); // true

        d = new Dog("Fifi");
        d.getDog().equals("Fifi"); // true
    }
}