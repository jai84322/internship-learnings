package RandomProblems;

// Write a Java program to separate zeros from non-zeros in an integer array?

import java.util.Arrays;

public class QueOne {
    public static void main(String[] args) {

        int arr[] = {2,0,3,4,0,0,5,0,8,9,0};

        int counter = 0; // 1
        for(int i=0; i<arr.length; i++) {
            if (arr[i] != 0) {
                arr[counter] = arr[i];
                counter++;
            }
        }

        while(counter<arr.length){
                arr[counter] = 0;
                counter++;
        }

        System.out.println(Arrays.toString(arr));

    }



}
