package list.ArrayListMethods;

import java.util.ArrayList;
import java.util.List;

public class Get {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list); // [2, 3, 4, 5, 6, 7]
        System.out.println(list.get(2)); // 4

    }
}

// it takes in one argument only which is the index
// it will return the element on that index
// it's work is to return the value/element on the given index