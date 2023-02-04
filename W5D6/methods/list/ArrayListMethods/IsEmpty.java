package list.ArrayListMethods;

import java.util.ArrayList;
import java.util.List;

public class IsEmpty {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println(list.isEmpty()); // true
    }
}

// return type : boolean, it returns true if the list is empty