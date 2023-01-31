package TreeSetMethods;

import java.util.Set;
import java.util.TreeSet;

public class Add {

    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(4);
        treeSet.add(9);
        treeSet.add(6);
        treeSet.add(7);
        treeSet.add(5);
        treeSet.add(3);
        System.out.println(treeSet);

        Set<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("hello");
        stringTreeSet.add("my");
        stringTreeSet.add("name");
        stringTreeSet.add("is");
        stringTreeSet.add("rahul");
        System.out.println(stringTreeSet);

    }

}

// what data type does the methods takes in as argument :- Integer, String, Character
// what data type does the methods return :- boolean
// what does the method do :- will add the element along with that they will be sorted