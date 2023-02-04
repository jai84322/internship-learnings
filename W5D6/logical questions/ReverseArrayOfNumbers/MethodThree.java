package ReverseArrayOfNumbers;

// using Collections.reverse()

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodThree {
    public static void main(String[] args) {
        Integer arr[] = {1,2,3,4,5,6,7};

        List<Integer> list = Arrays.asList(arr);
        Collections.reverse(list);
        System.out.println(list);

    }
}
