package arrayMethods;

import java.util.Arrays;

public class Fill {
    public static void main(String[] args) {

        // 2 arguments
        int nums[] = new int[8];
        Arrays.fill(nums,3);
        System.out.println(Arrays.toString(nums));

        // 4 arguments
        int nums2[] = new int[8];
        Arrays.fill(nums2, 2, 6, 9);
        System.out.println(Arrays.toString(nums2));

        // similarly you can fill array of strings
        String str[] = new String[8];
        Arrays.fill(str, 3,6,"hello");
        System.out.println(Arrays.toString(str));
    }
}


// in total it can take either 2 or 4 arguments
// it returns void
// it's work is to fill the array with whatever value you pass in