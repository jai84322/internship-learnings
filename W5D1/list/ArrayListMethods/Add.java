package ArrayListMethods;

import java.util.ArrayList;
import java.util.List;

public class Add {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(7);
        list.add(2,1);
        System.out.println(list.add(8));


//        System.out.println(list);
        System.out.println(list.toArray());

        List lst = new ArrayList();
        lst.add("str");
        lst.add(3);
        System.out.println(lst);
    }
}

// what does the method takes in as argument :- two methods boolean add() and void add(index,element)
// what does the method return :-
// what does the method do :-