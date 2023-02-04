package stringMethods;

public class CharAt {

    public static void main(String[] args) {
        String str = "hello sir";

        System.out.println(str.charAt(2));
        for (int i=0; i<str.length(); i++) {
            System.out.println(str.charAt(i));
        }


    }
}

// args it takes in index
// will return the element present on that index, return type : char
// it is used to print or select specific element of the string elements