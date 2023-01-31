package learn;
import java.util.*;

public class StartCode {
    public static void main(String[] args) {
        System.out.println("welcome to code java collection framework");

        // we are trying to create an object or ArrayList
        // type safe collection
        ArrayList<String> names = new ArrayList<>();
        names.add("Rahul");
        names.add("Siara");
        names.add("Noiva");
        names.add("Pushpak");
        names.add("Amit");
        names.add("Amit"); // duplicacy allowed
        names.add("Hawie");
//        names.add(555); // Type safe error
        System.out.println(names);
        System.out.println(names.get(0)); // elements are indexed
        System.out.println(names.get(1));



        // Un Type safe
        ArrayList list = new ArrayList();
        list.add("google");
        list.add(897); // Un Type safe list
        list.add(false);
        list.add(43.567);
        
        System.out.println(list);
    }
}
