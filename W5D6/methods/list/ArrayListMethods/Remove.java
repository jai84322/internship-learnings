package list.ArrayListMethods;


import java.util.ArrayList;
import java.util.List;

// if index is given in args then one return element and if object is passed then one return boolean

public class Remove {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(12);
        list.add(6);
        list.add(7);

        System.out.println(list); // [2, 3, 4, 12, 6, 7]
        System.out.println(list.remove(2)); // 4
        System.out.println(list); // [2, 3, 12, 6, 7]
        System.out.println(list.remove(Integer.valueOf(12))); // true
        System.out.println(list);

        List<String> strList = new ArrayList<>();
        strList.add("Ram");
        strList.add("Shyam");
        strList.add("Geeta");
        strList.add("Ramesh");
        strList.add("Suresh");
        System.out.println("strList : " + strList.remove("Ram")); // true
        System.out.println(strList.remove(3)); // Suresh

    }
}

// it takes either index or object as args
// will return removed element on given index or boolean for object
// it's work is to remove the element from the index