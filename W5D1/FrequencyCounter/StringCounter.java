package FrequencyCounter;

import java.util.HashMap;
import java.util.Map;

public class StringCounter {

    public static void stringCounter(String str) {
        str = str.replaceAll("\\s", "");
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++) {
        if(map.containsKey(str.charAt(i))) {
            map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
        } else {
            map.put(str.charAt(i), 1);
        }
        };

        map.forEach((k,v) -> {
            System.out.println(k + " exists " + v + " times");
        });
    };

    public static void main(String[] args) {
        String str = "hello sir this is jai";
        stringCounter(str);
    }

}