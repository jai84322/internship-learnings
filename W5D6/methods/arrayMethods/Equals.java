package arrayMethods;

import java.util.Arrays;

public class Equals {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5};
        int arr2[] = {2,3,4,5};
        int arr3[] = {4,7,8,6};

        System.out.println(arr == arr2); // false // reference comparision
        System.out.println(Arrays.equals(arr, arr2)); // true
        System.out.println(Arrays.equals(arr, arr3)); // false


        String str[] = {"a", "b", "c"};
        String str2[] = {"a", "b", "c"};
        System.out.println(str == str2); // false
        System.out.println(Arrays.equals(str,str2)); // true


    }
}

// it takes 2 arguments which is both arrays that you want to compare
// it returns boolean value
// it's work is of comparision