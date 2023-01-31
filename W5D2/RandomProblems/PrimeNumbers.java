package RandomProblems;

public class PrimeNumbers {

    public static void main(String[] args) {

        for(int i=1; i<50; i++) {

            int j=2;
            while(j<i) {
                if(i%j == 0) {
                    break;
                }
                j++;
            }
            if(i == j) {
                System.out.println(j + " is a prime number");
            }

        }
    }
}
