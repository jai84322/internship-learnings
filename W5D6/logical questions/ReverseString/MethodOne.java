package ReverseString;

// given String str = "sharma";
// output :- "amrahs";
// approach :- running reverse for loop


public class MethodOne {
    public static void main(String[] args) {
        String str = "sharma";
        String str2 = "";
        for (int i=str.length()-1; i>=0; i--) {
            str2 = str2 + str.charAt(i);
        }
        System.out.println(str2);
    }
}
