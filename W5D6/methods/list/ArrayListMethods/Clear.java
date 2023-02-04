package list.ArrayListMethods;

import java.util.ArrayList;
import java.util.List;

public class Clear {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(7);
        list.add(8);
        System.out.println(list);

        list.clear();
        System.out.println(list);

    }
}

// return type : void, it is used to remove all the elements from the list