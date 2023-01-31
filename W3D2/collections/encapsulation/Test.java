package encapsulation;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        // Taking input of student name
        Scanner sc = new Scanner(System.in);
        String user = sc.next();

        // creating instance of encapsulated class
        Student student = new Student();
//        jai.name =  "hello"; // can't change this variable directly it's declared private

        // setting name
        student.setName(user);

        System.out.println(student.getName());
    }
}
