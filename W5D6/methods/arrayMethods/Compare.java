package arrayMethods;

import java.util.Arrays;

public class Compare {
    public static void main(String[] args) {

        String str1[] = {"potato", "tomato", "A"};
        String str2[] = {"potato", "tomato", "B"};

        int strdiff = Arrays.compare(str1, str2);
//        System.out.println("strdiff : " + strdiff); // -1

        int nums1[] = {9};
        int nums2[] = {5};

        int intdiff = Arrays.compare(nums1,nums2);
        System.out.println("intdiff : " + intdiff); // 1
    }
}


// it takes in two arrays
// it returns int type 0 if there is no difference and if a>b then +1 and if a<b then -1
// it compares arrays lexicographically
// you can compare two string or two integer arrays