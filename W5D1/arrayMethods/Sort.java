package arrayMethods;

import java.util.Arrays;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {

        Integer arr[] = {7,9,4,8,2,6,5};

        // sorting in ascending order
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int unicodes[] = {'a','b','c','d','e','f','g','A','B','C'};
        Arrays.sort(unicodes);
        System.out.println(Arrays.toString(unicodes));

        // specific elements sorting
        Arrays.sort(arr,3,arr.length);
        System.out.println(Arrays.toString(arr));

        // decending order
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

        String str[] = {"Shyam", "Ram", "Bresh", "Tuysh"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));



    }


}

// return type : void
// will sort the array in ascending order
// arguments takes array, specific to specific index, and reverseOrder()