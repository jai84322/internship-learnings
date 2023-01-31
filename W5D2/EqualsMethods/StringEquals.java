package EqualsMethods;

public class StringEquals {
    public static void main(String[] args) {
        String str = "Amit";
        String str2 = "Amit";
        String str3 = "Rahul";

        System.out.println(str.equals(str2)); // true
        System.out.println(str.equals(str3)); // false
        System.out.println(str.compareTo(str2)); // 0
        System.out.println(str.compareTo(str3)); // -17
    }

}
