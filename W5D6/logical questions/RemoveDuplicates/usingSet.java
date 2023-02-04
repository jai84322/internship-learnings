package RemoveDuplicates;

import java.util.HashSet;
import java.util.Set;

public class usingSet {

    public static void removeDuplicates(int arr[]) {

        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length;i++) {
            set.add(arr[i]);
        }

        // printing elements
        set.forEach(e -> {
            System.out.println(e + " ");
        });

    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,5,3,2,4,8,6,5,1,3};
        removeDuplicates(arr);
    }

}

// T.C. =
// S.C. =