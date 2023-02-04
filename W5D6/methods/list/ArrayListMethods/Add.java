package list.ArrayListMethods;
import java.util.ArrayList;
import java.util.List;

// there are two add methods one return void and takes 2 args and one return boolean and takes 1 args

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
        list.add(2,1); // return void
        System.out.println(list.add(8)); // return boolean // true


        System.out.println(list); // [2, 3, 1, 4, 5, 6, 7, 7, 8]
        System.out.println(list.toArray());

        List lst = new ArrayList();
        lst.add("str");
        lst.add(3);
        System.out.println(lst); // [str, 3]
    }
}

// what does the method takes in as argument :- two methods boolean add() and void add(index,element)
// what does the method return :- boolean and void
// what does the method do :- append the element