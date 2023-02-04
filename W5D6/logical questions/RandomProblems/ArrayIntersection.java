package RandomProblems;

// Write a Java program to find the intersection/common elements of two arrays?

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {

    public static void main(String[] args) {

        // method - 1
//        String str[] = {"One", "Two", "Three", "Four", "Five", "Four"};
//        String str2[] = {"Three", "Four", "Five", "Six", "Seven", "Four"};
//
//        Set<String> set = new HashSet<>();
//
//        for (int i=0; i<str2.length; i++) {
//            for (int j = 0; j < str.length; j++) {
//                if (str[i].equals(str2[j])) {
//                    set.add(str[i]);
//                }
//            }
//        }
//        System.out.println(set);

        // method - 2
        String str[] = {"One", "Two", "Three", "Four", "Five", "Four"};
        String str2[] = {"Three", "Four", "Five", "Six", "Seven", "Four"};

        Set<String> set1 = new HashSet<>(Arrays.asList(str));
        Set<String> set2 = new HashSet<>(Arrays.asList(str2));

        set1.retainAll(set2);
        System.out.println(set1);




    }

}
