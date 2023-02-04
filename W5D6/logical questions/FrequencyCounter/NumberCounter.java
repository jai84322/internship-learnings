package FrequencyCounter;

import java.util.HashMap;
import java.util.Map;

public class NumberCounter {

    public static void numberCount(int arr[]) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1 );
            } else {
                map.put(arr[i], 1);
            }
        };

        map.forEach((k,v) -> {
            System.out.println(k + " exists " + v + " times");
        });
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,2,5,6,4,7,8,8,7,3};
        numberCount(arr);
    }

}
