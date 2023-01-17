
Exception : In Java, an exception is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime.
Suppose there are 10 statements in a Java program and an exception occurs at statement 5; the rest of the code will not be executed, i.e., statements 6 to 10 will not be executed. However, when we perform exception handling, the rest of the statements will be executed. That is why we use exception handling in Java.


public class JavaExceptionExample{  
  public static void main(String args[]){  
   try{  
      //code that may raise exception  
      int data=100/0;  
   }catch(ArithmeticException e){System.out.println(e);}  
   //rest code of the program   
   System.out.println("rest of the code...");  
  }  
}  

--------------------------------------------------------------------------------------------------------------------------------------------------------------------
Java finally block

- When an exception does not occur
- When an exception occurr but not handled by the catch block
- When an exception occurs and is handled by the catch block  

- In all the above case finally will always be executed 


--------------------------------------------------------------------------------------------------------------------------------------------------------------------
Java throw and throws keyword
- throw keyword is used to throw and excception object explicitly. ex: throw new AE();
- throws keyword is used to declare the exception as well as bypass the caller 

- throw keyword is always inside the method body.
- throws keyword is always used with method signature.

- we can handle only one exception at a time.
- we can handle multiple exception using throws keyword.

- throw is followed by an instance
- throws is followed by a class



