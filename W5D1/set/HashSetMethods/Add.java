package HashSetMethods;

import java.util.HashSet;
import java.util.Set;

public class Add {


    public static void main(String[] args) {

        Set<Integer> intSet = new HashSet<>();
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(4); // won't show up
        System.out.println(intSet);

        Set<Character> charSet = new HashSet<>();
        charSet.add('h');
        charSet.add('e');
        charSet.add('l');
        charSet.add('o');
        System.out.println(charSet);

        Set<String> stringSet = new HashSet<>();
        stringSet.add("hello");
        stringSet.add("my");
        stringSet.add("name");
        stringSet.add("is");
        stringSet.add("rahul");
        stringSet.add("2");
        System.out.println(stringSet);

        System.out.println(stringSet.add("namita")); // true
    }

}

// what data type does the methods takes in as argument :- Integer, String, Character
// what data type does the methods return :- boolean value
// what does the method do :- will add the element you input

