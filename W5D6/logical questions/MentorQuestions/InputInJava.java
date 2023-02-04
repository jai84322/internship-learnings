package MentorQuestions;
import java.util.Scanner;


public class InputInJava {
    public static void main(String[] args) {
        System.out.print("enter your name : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("your name is : " + str);

        System.out.print("your age is : ");
        int age = sc.nextInt();
        System.out.println("your age is : " + age);

    }
}
