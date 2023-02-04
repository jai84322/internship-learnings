package HashSetMethods;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TraversalTwo {
    public static void main(String[] args) {
        Set<Integer> intSet = new HashSet<>();
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(6);
        intSet.add(7);


        // iterator
        Iterator<Integer> itr = intSet.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }


        Set<String> stringSet = new HashSet<>();
        stringSet.add("hello");
        stringSet.add("my");
        stringSet.add("name");
        stringSet.add("is");
        stringSet.add("rahul");

        // iterator
        Iterator<String> itrTwo = stringSet.iterator();
        while(itrTwo.hasNext()) {
            System.out.println(itrTwo.next());
        }

        Set<Character> charSet = new HashSet<>();
        charSet.add('h');
        charSet.add('e');
        charSet.add('l');
        charSet.add('o');

        // iterator
        Iterator<Character> itrThree = charSet.iterator();
        while(itrThree.hasNext()) {
            System.out.println(itrThree.next());
        }

    }


}


