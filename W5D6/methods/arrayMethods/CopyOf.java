package arrayMethods;

import java.util.Arrays;

public class CopyOf {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
        int newarr[] = Arrays.copyOf(arr,10);
        System.out.println(Arrays.toString(newarr)); // [2, 3, 4, 5, 6, 0, 0, 0, 0, 0]
    }
}

// it takes in array in 1st arg and size of new array in 2nd arg
// it return new array with increased size as we know size of array is fixed so this will copy elements of original array and will create a new one.

