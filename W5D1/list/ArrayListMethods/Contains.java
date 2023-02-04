package list.ArrayListMethods;


import java.util.ArrayList;
import java.util.List;

public class Contains {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list); // [2, 3, 4, 5, 6, 7]
        System.out.println(list.contains(9)); // false

    }
}

// takes in the element as args you want to search for
// return type : boolean
// it's work is to search for the element if it exists in list it will return true else will return false