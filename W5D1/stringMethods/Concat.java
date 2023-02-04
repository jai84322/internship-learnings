package stringMethods;

public class Concat {
    public static void main(String[] args) {
        String str = "Hello ";
        String str2 = "Sir";

        System.out.println(str + str2);
        System.out.println(str.concat(str2));

    }
}

// takes in another string as argument which you want to concat
// return type : String