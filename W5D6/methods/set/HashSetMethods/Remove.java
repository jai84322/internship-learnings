package HashSetMethods;

import java.util.HashSet;
import java.util.Set;

public class Remove {
    public static void main(String[] args) {

        Set<Integer> intSet = new HashSet<>();
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(4); // won't show up
        intSet.add(6);
        intSet.add(7);
//        intSet.remove(6);
        System.out.println(intSet.remove(5)); // false
        System.out.println(intSet.remove(6)); // true
        System.out.println(intSet);
    }
}


// what data type does the methods takes in as argument :- Integer, String, Character
// what data type does the methods return :- boolean
// what does the method do :- it will remove the element you input
