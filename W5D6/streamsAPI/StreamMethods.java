package streamsAPI;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {

        // filter method
        List<String> names = List.of("Aman", "Ankit", "Abhinav", "Durgesh");
        List<String> newNames = names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newNames);

        // map method
        List<Integer> numbers = List.of(23,4,2,5,7,8);
        List<Integer> newNumbers = numbers.stream().map(e -> e * e).collect(Collectors.toList());
        System.out.println(newNumbers);

        // sorting using stream
        numbers.stream().sorted().forEach(System.out::println);

        // find smallest number
        Integer integer = numbers.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("min "+integer);

        // find largest number
        Integer integer1 = numbers.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println("max "+integer1);

    }
}
