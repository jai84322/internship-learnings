package stringMethods;

public class CompareTo {
    public static void main(String[] args) {
        String str = "A";
        String str2 = "B";
        System.out.println(str.compareTo(str2)); // 65-66 = -1
    }

}

// compares two strings lexicographically
// takes another string as argument
// returns either 0(if both strings are same) or the unicode difference between two strings
