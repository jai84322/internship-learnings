
public class Array{

    // example to get the minimum number of an array using a method
    // creating a method which receives an array as a parameter 
    static void min(int arr[]) {

        int min = arr[0];
        for (int i=0; i<arr.length; i++) {
            if (min < arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {

        // 3 ways of array declaration 
        int arr[];
        int []arr2;
        int[] arr3;

        // instantiation
        arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        // declaration, instantiation, initialization
        int arr4[] = new int[5]; // declaration, instantiation
        arr4[0] = 4; // initialization
        arr4[1] = 5;
        arr4[2] = 6;
        arr4[3] = 7;
        arr4[4] = 8;

        // traversing array
        for(int i=0; i<arr4.length; i++) {
            System.out.println(arr4[i]);
        }

        int arr5[] = {1,2,3,4,5}; //declaration, instantiation and initialization in one line
        for(int i=0; i<arr5.length; i++) {
            System.out.println(arr5[i]);
        }

        int arr6[] = {2,3,4,5,6,7, 23, 45, 25}; // declaring and initializing an array 
        min(arr6); // passing array to method

    };

};


