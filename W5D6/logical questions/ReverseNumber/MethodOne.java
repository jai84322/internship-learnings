package ReverseNumber;

// using logic

public class MethodOne {
    public static void main(String[] args) {
        int number = 1234567;

        String temp = "";
        while(number>0) {
            temp += number%10;
            number /= 10;
        }
        System.out.println(temp);
        for (int i=0; i<temp.length(); i++) {
//            System.out.println(Integer.valueOf(temp.charAt(i))); // returning unicode of 765431
//            System.out.println(Integer.parseInt("" + temp.charAt(i)));
            System.out.println(temp.charAt(i));
        }
    }
}

