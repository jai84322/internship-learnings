package MentorQuestions;

// given two arrays int arr[] = {1,2,3,4,5,6,7,8,0};
// output :- {1,8,2,7,3,6,4,5};

import java.util.Arrays;

public class QueThree {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,0,7,9,5,6,7,8};
        int arr3[] = new int[arr.length];

        // pointer for arr3
        int k=0;

        // i and j pointers for arr
        int i=0;
        int j=arr.length-1;

        while(i<j) {
            arr3[k] = arr[i];
            i++;
            k++;
            arr3[k] = arr[j];
            j--;
            k++;
            System.out.println(i);
            System.out.println(j);
        }
        System.out.println(Arrays.toString(arr3));
    }
}
