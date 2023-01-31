package HashMapMethods;

import java.util.HashMap;
import java.util.Map;

public class Put {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Rahul",23);
        map.put("Vinay",22);
        map.put("Nishit",21);
        map.put("Mayank",24);
        map.put("Sagar",25);
        map.put("jai", 24);
        System.out.println(map);
    }

}


// what does method takes in as argument :- key and value as Integer, String, Character, Boolean
// what does method return :- null or void
// what does the method do :- it is used to insert key and value pairs
