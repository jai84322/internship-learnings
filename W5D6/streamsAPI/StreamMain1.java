package streamsAPI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {
        // create a list and filter all even numbers

        // method-1 to create list
        List<Integer> list1 = List.of(2, 4, 5, 6, 7); // it's an immutable object
//        list1.add(3); // immutable object

        // method-2 to create list
        List<Integer> list2 = new ArrayList<>();
        list2.add(21);
        list2.add(22);
        list2.add(23);
        list2.add(24);

        // method-3 to create list
        List<Integer> list3 = Arrays.asList(32,45,56,74,85);
//        list3.add(78); // this is also immutable


        // without stream
        List<Integer>listEven  = new ArrayList<>();

        for (Integer i : list1) {
            if (i % 2 == 0) {
                listEven.add(i);
            }
        }

        System.out.println(list1);
        System.out.println(listEven);

        // using stream
        Stream<Integer> stream = list1.stream(); // creating stream api object
        List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);
    }
}
