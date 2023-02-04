package LinkedHashSetMethods;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Add {
    public static void main(String[] args) {

    Set<Integer> linkSet = new LinkedHashSet<>();
        linkSet.add(3);
        linkSet.add(4);
        linkSet.add(5);
        linkSet.add(6);
        linkSet.add(7);
        System.out.println(linkSet);

        Set<Character> charSet = new LinkedHashSet<>();
        charSet.add('h');
        charSet.add('e');
        charSet.add('l');
        charSet.add('o');
        System.out.println(charSet);

    }
}

// what data type does the methods takes in as argument :- Integer, String, Character
// what data type does the methods return :- boolean
// what does the method do :- will add the element along with order is preserved
