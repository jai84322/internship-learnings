package map.HashMapMethods;

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
        System.out.println(map.put("Anul",29)); // returns null
        System.out.println(map.remove("Sagar",25)); // boolean
        System.out.println(map.keySet()); // returns set view
        System.out.println(map.containsKey("Mayank")); // boolean
        System.out.println(map.containsValue(21)); // boolean
//        System.out.println(map.equals()); // boolean, used to compare two map objects
        System.out.println(map.replace("Nishit", 27)); // returns previous existing value
        System.out.println(map.get("Rahul")); // returns value




        System.out.println(map);

//        for (Map.Entry<String,Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

        for (String str : map.keySet()) {
            int age = map.get(str);
            System.out.println(str + " " + age);
        }

    }

}


// what does method takes in as argument :- key and value as Integer, String, Character, Boolean
// what does method return :- null or void
// what does the method do :- it is used to insert key and value pairs
