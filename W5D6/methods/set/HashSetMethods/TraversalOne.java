package HashSetMethods;

import java.util.HashSet;
import java.util.Set;

public class TraversalOne {
    public static void main(String[] args) {
        Set<Integer> intSet = new HashSet<>();
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(6);
        intSet.add(7);

        // simple for loop does not work here
//        for (int i=0; i<intSet.size(); i++){
//            System.out.println(intSet);
//        }

        // iterable
        for (int i : intSet) {
            System.out.println(i);
        }

        Set<String> stringSet = new HashSet<>();
        stringSet.add("hello");
        stringSet.add("my");
        stringSet.add("name");
        stringSet.add("is");
        stringSet.add("rahul");

        // simple for loop does not work here
//        for (int i=0; i<intSet.size(); i++){
//            System.out.println(stringSet);
//        }

        // iterable
        for (String str : stringSet) {
            System.out.println(str);
        }

        Set<Character> charSet = new HashSet<>();
        charSet.add('h');
        charSet.add('e');
        charSet.add('l');
        charSet.add('o');

        // simple for loop does not work here
//        for (int i=0; i<intSet.size(); i++){
//            System.out.println(charSet);
//        }

        // iterable
        for (char ch : charSet) {
            System.out.println(ch);
        }

    }


}

// simple for loop does not work here
