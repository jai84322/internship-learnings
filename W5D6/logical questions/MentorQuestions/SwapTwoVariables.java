package MentorQuestions;

// swap two variables without using third variable

public class SwapTwoVariables {
    public static void main(String[] args) {
        int a = 8;
        int b = 6;

        System.out.println("a is : " + a + " and b is : " + b);

        a = a+b;
        // a = 8+6 => 14
        b = a-b;
        // b = 14-6 => 8
        a = a-b;
        // a = 14-8 => 6

        System.out.println("now a is : "+ a + " and now b is : " + b);

    }
}
