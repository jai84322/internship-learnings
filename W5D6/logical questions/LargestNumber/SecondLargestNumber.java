package LargestNumber;

public class SecondLargestNumber {

    public static int SecondLargestNumber(int arr[]) {
            int largest = arr[0];
            for(int i=0; i<arr.length; i++){
                if (largest < arr[i]) {
                    largest = arr[i];
                }
            }

            int secondLargest = arr[0];
            for(int i=0; i<arr.length; i++){
                if(secondLargest < arr[i] && arr[i] != largest) {
                    secondLargest = arr[i];
                }
            }

            return secondLargest;
    };

    public static void main(String[] args) {
        int arr[] = {8,9,7,5,6,4,2,3};
        int secondLargest = SecondLargestNumber(arr);
        System.out.println(secondLargest);
    }
}
