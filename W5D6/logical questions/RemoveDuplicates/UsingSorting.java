package RemoveDuplicates;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UsingSorting {

    public static int removeDuplicates(int arr[], int n) {
          if(n==0 || n==1) {
            return n;
          };
          int temp[] = new int[n];
          int j=0;
          for(int i=0; i<n-1;i++) {
              if (arr[i] != arr[i+1]) {
                  temp[j++] = arr[i];
              }
          }
          temp[j++] = arr[n-1];

          // changing original array
        for(int i=0; i<j;i++) {
            arr[i] = temp[i];
        }
        return j;
    };

    public static void main(String[] args) {
    int arr[] = {2,3,2,4,5,3,6,7,5};
    Arrays.sort(arr);
    int length = arr.length;
    length = removeDuplicates(arr,length);

    // printing elements
        for(int i=0; i<length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}


// T.C. =
// S.C. =
