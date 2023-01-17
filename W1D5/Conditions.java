import java.util.*;

public class Conditions{


    static void adult(int age) {
        if (age > 18) {
            System.out.println("Adult");            
        } else {
            System.out.println("you 're not adult");
        }
    };

    static void evenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("it even number");
        } else {
            System.out.println("it's odd number");
        }
    } 

    static void largest(int x, int y){
        if (x == y) {
            System.out.println("x is equal to y");
        } else {
            if (x > y) {
                System.out.println("x is larger than y");
            } else {
                System.out.println("x is smaller than y");
            }
        }
    }

    public static void main(String args[])  {

        // Taking input of age
        System.out.println("Enter age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        // Finding whether adult or not
        adult(age);

        // Taking inpur of integer
        int num = sc.nextInt();
        
        // Find even or odd number
        evenOrOdd(num);

        // Taking input of two numbers
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        // Finding which one is larger number
        largest(x, y);

        // If first one fails then it will go on to second then if second fails then it will eventually go on to third 
        // if (x == 2) {
        //     System.out.println("this is equal 2");
        // } else if (x % 2 == 0) {
        //     System.out.println("it is even also");
        // } else {
        //     System.out.println("it's nothing");
        // }

        // Both will be working
        // if (x % 2 == 0) {
        //     System.out.println("it is even also");
        // }
        // if (x == 2 ) {
        //     System.out.println("it is equal to 2");
        // }
    }
}


