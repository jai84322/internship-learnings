package SmallestNumber;

public class SmallestNumber {

    public static int smallestNumber(int arr[]) {
            int smallest=arr[0];

        for(int i=0; i<arr.length;i++)
            {
                if(smallest > arr[i] ) {
                    smallest = arr[i];
                }
            }
        return smallest;
    };

    public static void main(String[] args) {
      int arr[] = {8,5,6,7,4,3,2};
      int smallest = smallestNumber(arr);
        System.out.println(smallest);
    }
}
