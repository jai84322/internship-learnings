package EqualsMethods;

public class EqualsOperator {

    // for objects it will do reference based comaparision
    // for primitives it will do value based comaparision

    public static void main(String[] args) {
        String st = new String("Hello");
        String st1 = new String("Hello");

        System.out.println(st == st1); // false

        // for primitives
        int a = 9;
        int b = 9;
        System.out.println( a == b); // true
    }

}
