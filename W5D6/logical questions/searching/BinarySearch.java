package searching;

// one condition : array has to be sorted

public class BinarySearch {
    public static int binarySearch(int arr[], int num, int start, int end ) {

        int mid = (start +end)/2;
        if(end>=start){
            if (num == arr[mid]) return mid;
            if (num>arr[mid]) return binarySearch(arr,num,mid+1,end);
            if (num<arr[mid]) return binarySearch(arr,num,start,mid-1);
        }
        return -1;
    };

    public static void main(String[] args) {
            int arr[] = {2,3,4,5,12,18,24,26,28,31,33,35,38,39};
            int num = 31;
            int start = 0;
            int end = arr.length-1;
            int index = binarySearch(arr,num,start,end);
            System.out.println(index);
    }
}
