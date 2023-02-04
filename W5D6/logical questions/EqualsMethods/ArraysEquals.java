package EqualsMethods;

import java.util.Arrays;

public class ArraysEquals {
    public static void main(String[] args) {

        int arr[] = {2,3,4,5};
        int arr2[] = {2,3,4,5};

        String str[] = {"hello", "Rahul"};
        String str2[] = {"hello", "Rahul"};

        System.out.println(Arrays.equals(arr,arr2)); // true
        System.out.println(Arrays.equals(str,str2)); // true


        String str3 = "Amit";
        String str4 = "Amit";

//        System.out.println(Arrays.equals(str3,str4)); // won't work

    }
}
