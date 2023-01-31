package MentorQuestions;

// given two arrays int arr[] = {1,3,5,7}; int arr2[] = {2,4,6,8};
// output :- {1,2,3,4,5,6,7,8};

import java.util.Arrays;

public class QueOne {
    public static void main(String[] args) {

        int arr[] = {1,3,5,7};
        int arr2[] = {2,4,6,8};

        int arr3[] = new int[arr.length + arr2.length];

        int j = 0;
        for(int i=0; i<arr3.length; i++) {
            arr3[i] = arr[j];
            i++;
            arr3[i] = arr2[j];
            j++;
        }

        System.out.println(Arrays.toString(arr3));
    }

}
