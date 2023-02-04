package arrayMethods;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int nums[] = {5,4,3,2,7,1,6,0,-1};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums)); // [-1, 0, 1, 2, 3, 4, 5, 6, 7]
        System.out.println(Arrays.binarySearch(nums,4)); // 5
        System.out.println(Arrays.binarySearch(nums, -3)); // -1
        System.out.println(Arrays.binarySearch(nums, 8)); // -10


    }
}

// works upon sorted array only
// returns the index of the element
// it is used to search the element in the array
// takes array and element to search as arguments
// if the element is not found than we will return = -(insertion index + 1)
