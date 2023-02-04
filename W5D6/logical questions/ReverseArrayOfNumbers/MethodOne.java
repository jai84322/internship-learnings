package ReverseArrayOfNumbers;

// printing all elements in reverse order

public class MethodOne {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};

        for (int i=arr.length-1; i>=0; i--) {
        System.out.println(arr[i]);
        }
    }
}
