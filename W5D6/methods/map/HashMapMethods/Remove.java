package HashMapMethods;

import java.util.HashMap;
import java.util.Map;

public class Remove {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Rahul",23);
        map.put("Vinay",22);
        map.put("Nishit",21);
        map.put("Mayank",24);
        map.put("Sagar",25);
        map.remove("Vinay");
        System.out.println(map);
    }

}
