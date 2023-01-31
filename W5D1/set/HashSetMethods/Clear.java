package HashSetMethods;

import java.util.HashSet;
import java.util.Set;

public class Clear {

    public static void main(String[] args) {

    Set<Integer> intSet = new HashSet<>();
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(4); // won't show up
        intSet.add(6);
        intSet.add(7);
        intSet.clear();

        System.out.println(intSet);

    }
}

// what data type does the methods takes in as argument :- does not take any argument
// what data type does the methods return :- void
// what does the method do :- will empty the whole set
