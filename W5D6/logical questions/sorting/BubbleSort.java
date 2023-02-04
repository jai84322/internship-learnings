package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int arr[]) {

        for (int i=1; i<arr.length; i++) {
            for (int j=0; j<i; j++) {
                if(arr[i] < arr[j]) {
                    int x = arr[j];
                    arr[j] = arr[i];
                    arr[i] = x;
                }
            }
        }
        return arr;
    };

    public static void main(String[] args) {
        int arr[] = {2,23,19,46,15,76,58,86,13};
        int sortArr[] = bubbleSort(arr);
        System.out.println(Arrays.toString(sortArr));
    }
}
