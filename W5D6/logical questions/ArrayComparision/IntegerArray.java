package ArrayComparision;

import java.util.Arrays;

public class IntegerArray {

    public static void main(String[] args) {

    int arr[] = {2,4,6,7,9};
    int arr2[] = {2,4,6,7,9};
    boolean isEqual = true;


    if(arr.length == arr2.length) {
        for (int i=0; i<arr.length;i++) {
            if(arr[i] != arr2[i]) {
                 isEqual = false;
            }
        }
    }

    if(isEqual) {
        System.out.println("two arrays are equal");
    } else {
        System.out.println("two arrays are not equal");
    }

    }
}
