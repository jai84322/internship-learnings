package MentorQuestions;

// swap two arrays

import java.util.Arrays;

public class SwapTwoArrays {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
        int arr2[] = {7,8,9,2,5};
        int arr3[] = new int[5];

        System.out.println("arr before swapping : " + Arrays.toString(arr));
        System.out.println("arr2 before swapping : " + Arrays.toString(arr2));

//        // using third array
//        for (int i=0; i<arr3.length; i++)  {
//            arr3[i] = arr[i];
//            arr[i] = arr2[i];
//            arr2[i] = arr3[i];
//        }
//
        // without using third array
        for (int i=0; i<arr.length; i++) {
            arr[i] = arr[i] + arr2[i];
            arr2[i] = arr[i] - arr2[i];
            arr[i] = arr[i] - arr2[i];
        }

        System.out.println("arr after swapping : " + Arrays.toString(arr));
        System.out.println("arr2 after swapping : " + Arrays.toString(arr2));

    }
}
