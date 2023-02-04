package MentorQuestions;

// given String str = "abbcccdddd";
// output :- {a=1, b=2, c=3, d=4};

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String str = "abbcccdddd";

        for(int i=0; i<str.length();i++) {
            if(map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }

        System.out.println(map);

        // printing map
        map.forEach((k,v) -> {
            System.out.println(k + " = " + v);
        });

    }
}
