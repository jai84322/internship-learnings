package MentorQuestions;
import java.util.Arrays;

// given two arrays int arr[] = {1,2,3,4,5}; int arr2[] = {6,7,8,9};
// output :- {1, 2, 3, 4, 5, 6, 7, 8, 9};


public class ConcatTwoArrays {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr2[] = {6,7,8,9};
        int arr3[] = new int[arr.length + arr2.length];

        int j=arr.length;
        for (int i=0; i<arr.length; i++) {
                arr3[i] = arr[i];
                if (arr2.length > i) {
                    arr3[j] = arr2[i];
                }
                j++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
