package arrayMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ways to create list/ convert array into a list

public class AsList {

    public static void main(String[] args) {

        // this is method-1 to create a list
        // this is also a way to convert array into a list
        String str[] = {"Ram", "Shyam", "Geeta"};
//        int arr[] = {1,2,3,4,5,6,7};
        Integer arr[] = {1,2,3,4,5,6,7};

        List<String> strList = Arrays.asList(str);
        List<Integer> intList = Arrays.asList(arr);

//        strList.add("hello"); // not allowed
//        intList.add(4); // not allowed

        System.out.println(strList);
        System.out.println(intList);

        // method-2 to create a list
        List<Integer> listof = List.of(2,3,4,5,6,7);

        // method-3 to create a list
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(7);
        System.out.println(list);

    }
}

// it takes in the array as argument
// it returns a list of fixed size which is immutable
// it's work is to convert an array into a list
