package MentorQuestions;

// given two arrays int arr[] = {1,2,3,4,5}; int arr2[] = {2,4,5};
// output :- {1,3};

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr2[] = {2,4,5};

        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }

            if(arr2.length > i){
               if ( map.containsKey(arr2[i]) ) {
                    map.put(arr[i], map.get(arr[i]) + 1);
                } else {
                   map.put(arr2[i], 1);
               }
            }
        }

        // printing non repeating element from both arrays
        map.forEach((k,v) -> {
            if (map.get(k) == 1) {
                System.out.println("non repeating element from both array is : " + k);
        }
        });

        // printing common/repeating elements from both arrays
        map.forEach((k,v) -> {
            if (map.get(k) > 1) {
                System.out.println("common/repeating elements in both array is : " + k);
            }
        });

        // printing unique elements from both arrays
        map.forEach((k,v) -> {
            System.out.println("unique elements from both array is : " + k);
        });
    }
}
