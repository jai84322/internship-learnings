package ArrayComparision;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringArray {

    public static void main(String[] args) {

        String str[] = {"Ram", "Shyam", "Ramesh"};
        String str2[] = {"Ram", "Shyam", "Ramesh"};
        String str3[] = {"Raam", "Shyam", "Ramesh"};

        System.out.println(Arrays.equals(str,str3)); // false
        System.out.println(Arrays.equals(str, str2)); // true


    }
}
