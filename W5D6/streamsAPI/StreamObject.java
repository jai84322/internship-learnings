package streamsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.List;

// ways to create stream

public class StreamObject {
    public static void main(String[] args) {
        
        // method - 1
        Stream<Object> emptyStream = Stream.empty();

        // method - 2
        String names[] = {"Durgesh", "Ramesh", "Suresh", "Divya"};

        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e -> {
            System.out.println(e);
        });

        // method - 3
        Stream<Object> streamBuilder = Stream.builder().build();

        // method - 4
        IntStream stream = Arrays.stream(new int[]{2, 4, 5, 6, 7});
        stream.forEach(e->{
            System.out.println(e);
        });

        // method - 5
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(44);
        list2.add(55);
        list2.add(66);

        Stream<Integer> stream2 = list2.stream();
        stream2.forEach(e -> {
            System.out.println(e);
        });
    }
}
