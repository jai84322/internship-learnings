package MentorQuestions;

// given two arrays int arr[] = {1,3,5,7}; int arr2[] = {2,4,6,8};
// output :- {1,3,5,7,2,4,6,8};


import java.util.Arrays;

public class QueTwo {

    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9};
        int arr2[] = {2,4,6,8};
        int arr3[] = new int[arr.length + arr2.length];
        // arr3[] = {0,0,0,0,0,0,0,0}

        int j = arr.length;
        for(int i=0; i<arr.length; i++) {

                arr3[i] = arr[i];

                if (arr2.length > i ) {
                    arr3[j] = arr2[i];
                }

                j++;
        }
        System.out.println(Arrays.toString(arr3));
    }

}
