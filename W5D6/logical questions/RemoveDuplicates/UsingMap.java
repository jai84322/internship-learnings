package RemoveDuplicates;

import java.util.HashMap;
import java.util.Map;

public class UsingMap {

    public static void removeDuplicates(int arr[]) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length;i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            } else {
                map.put(arr[i],1);
            }
        }
        // printing non duplicates
        map.forEach((k,v) -> {
            System.out.println(k);
        });

        System.out.println(map.keySet());

        // putting it inside an array
        int arr2[] = new int[arr.length];
        for(int i=0; i<arr.length;i++) {
//            arr2[i] = map.keySet();
        }
    }


    public static void main(String[] args) {
        int arr[] = {2,3,4,2,5,6,3,7,5,8,6};
        removeDuplicates(arr);
    }

}

// T.C. =
// S.C. =