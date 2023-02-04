package stringMethods;

public class CodePointAt {
    public static void main(String[] args) {
        String str = "Hello sir";
        System.out.println(str.codePointAt(2));
        for (int i=0; i<str.length(); i++ ) {
            System.out.println(str.codePointAt(i));
        }
    }
}

// it takes in index as argument
// will return the unicode of the character present at the specified index. return type : int
