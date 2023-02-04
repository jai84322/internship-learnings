package list.ArrayListMethods;

import java.util.ArrayList;
import java.util.List;

public class Set {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list); // [2, 3, 4, 5, 6, 7]
        System.out.println(list.set(2,9)); // 4
        System.out.println(list); // [2, 3, 9, 5, 6, 7]
    }
}

// this method takes 2 args : one for index and 2nd for element you want to set
// it returns the previously existent element on that index
// it's work is to replace the element on the given index and set the new element you pass in