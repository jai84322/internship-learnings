package TreeMap;


import java.util.Map;
import java.util.TreeMap;

public class Put {

    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Rahul",23);
        map.put("Vinay",22);
        map.put("Nishit",21);
        map.put("Mayank",24);
        map.put("Sagar",25);
        System.out.println(map);
    }

}
