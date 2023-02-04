package ReverseNumber;

// run a reverse forloop

public class MethodTwo {
    public static void main(String[] args) {
        int number = 1234567;
        String temp = "" + number;

        for (int i=temp.length()-1; i>=0;  i--) {
            System.out.println(temp.charAt(i));
        }
    }
}
