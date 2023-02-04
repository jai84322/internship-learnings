package LargestNumber;

public class LargestNumber {

    public static int largestNumber(int arr[]) {
            int largest = arr[0];
            for(int i=0; i<arr.length; i++) {
                if(largest < arr[i]) {
                    largest = arr[i];
                }
            }
            return largest;
    }

    public static void main(String[] args) {
        int arr[] = {8,5,9,6,7,4,3,2};
        int largestNumber = largestNumber(arr);
        System.out.println(largestNumber);
    }

}
