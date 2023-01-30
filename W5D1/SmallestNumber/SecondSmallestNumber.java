package SmallestNumber;

public class SecondSmallestNumber {

    public static int secondSmallestNumber(int arr[]) {
        int smallest = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(smallest > arr[i]) {
                smallest = arr[i];
            }
        }

        int secondSmallest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(secondSmallest > arr[i] && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        return secondSmallest;

    };

    public static void main(String[] args) {
        int arr[] = {8,9,7,5,6,4,2,3};
        int secondSmallest = secondSmallestNumber(arr);
        System.out.println(secondSmallest);
    }

}
