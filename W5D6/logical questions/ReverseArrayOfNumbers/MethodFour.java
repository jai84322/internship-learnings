package ReverseArrayOfNumbers;

import java.util.Arrays;

// reversing the elements in same array

public class MethodFour {
    public static void main(String[] args) {
        int array[] = {2,3,4,5,6,7,8,9};
        int n = array.length/2; // if (arr.length == 7){3}, if (arr.length == 8){4}
        System.out.println(n);
        for(int i=0; i<n; i++){
            int j= array[i]; // i=0, 2 // i=1, 3 // i=2, 4 // i=3, 5
            array[i] = array[array.length -i -1]; // array[0]=9, array[1]=8, array[2]=7, array[3]=6
            array[array.length -i -1] = j; // array[7]=2, array[6]=3, array[5]=4, array[4]=5
        }
        System.out.println(Arrays.toString(array));
    }
}
