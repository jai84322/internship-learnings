package HashSetMethods;

import java.util.HashSet;
import java.util.Set;

public class Contains {

    public static void main(String[] args) {
        Set<Integer> intSet = new HashSet<>();
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(4); // won't show up
        intSet.add(6);
        intSet.add(7);
        System.out.println(intSet);

        System.out.println(intSet.contains(5)); // false
        System.out.println(intSet.contains(6)); // true

    }

}


// what data type does the methods takes in as argument :- Integer, String, Character
// what data type does the methods return :- boolean value
// what does the method do :- will search for the element you input

