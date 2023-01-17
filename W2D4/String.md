- In Java, string is an object that represents a sequence of characters. A string is immutable but we can explicitly mutate it.

How to create a string object?

There are two ways to create String object:

1. By string literal
2. By new keyword

---

1. String literal : To make Java more memory efficient this string literal concept is used.

ex- String s="welcome";

- Each time we create string using literal the JVM checks the "string constant pool" first.
- If the string already exists in the pool, a reference to the pooled instance is returned.
- If the string doesn't exist in the pool, a new string instance is created and placed in the pool.
  ex-
  String s1="Welcome";  
  String s2="Welcome";//It doesn't create a new instance

Note: strings created by literals are stored in special memory area known as the "string constant pool". It's inside heap memory.

ex-
class Programmer {

    public static void main(String args[]){
        String s = "Hello";
        System.out.println(s);

        String t = "Hello";
        System.out.println(t);

        s.concat("world");
        System.out.println(s); // Hello

        // mutating explicitly
        s = s.concat(" world"); // Hello world
        System.out.println(s);

}  
};

---

2. new keyword :

ex- String s=new String("Welcome");

- strings created with String keyword are stored inside (non pool) heap memory.

q- what if I create one using literal and one using new keyword and naming both same ?
ans- In such case, JVM will create a new string object in normal (non-pool) heap memory, and the literal "Welcome" will be placed in the string constant pool. The variable s will refer to the object in a heap (non-pool).

ex-
class Programmer {

    public static void main(String args[]){
        String a = new String("Hello");
        System.out.println(a);

        String b = new String("Hello");
        System.out.println(b);

        a.concat("world");
        System.out.println(a); // Hello

        // mutating explicitly
        a = a.concat(" world"); // Hello world
        System.out.println(a);

}  
};

---

Q- Why are String objects immutable ?

- As Java uses the concept of String literal. Suppose there are 5 reference variables, all refer to one object "Sachin". If one reference variable changes the value of the object, it will be affected by all the reference variables. That is why String objects are immutable in Java.
- each time we when we change the string explicitly it creates new string objects and thus allocates new memory. more memory allocation means less performance

- it makes it secure, thread safe, A ClassLoader in Java uses a String object as an argument If the String object is modifiable, the value might be changed.

Q- Why String class is Final in Java?
The reason behind the String class being final is because no one can override the methods of the String class. And because of that it provides same features to new string objects and old ones too.

Q- what is final keyword ?

- it can be used with variable, methods, class.
- it provides restriction to change.
- The final keyword is also a non-access modifier. which makes them non-changeable (impossible to inherit or override).
- this is just like const in javascript. Once we declare a variable with final then we cannot perform reassignment.
- classes declared with final keyword cannot be extended
- methods declared with final keyword cannot be overridden to extended class

Q- where does static keyword gets memory ? stack or heap ?

- lets say I created an instance variabele and I am creating new objects with two attribute emp name and company name. Now there are 1000's of employees whose names are different but their company name is same so if I will create this as instance then for each object it will be taking space in heap for same comapany name. Instead what I will do is I will create a static variable which is created once and is shared among all the objects.
- static keyword allocates memory in the method area and that method area gets shares among all objects. Method Area is a part of the heap memory which is shared among all the threads.

Q- Why String args[]?

- because When you run a Java program from a command line, you are allowed to pass data into that program as comnand line arguments.Your Java program will run from a main() method, and the arguments you typed on the command line will appear to the Java program as Strings in that array.
- Also, command line arguments are Strings which is why that is the data type.
- Because by passing String arrays, we can pass all the necessary parameters like options/arguments related to the program in the form of String easily. There can be several parameters!
- Also, all the other datatypes can be easily converted from String!

Q- What is string builder and String buffer and string

- they both are stored inside heap area.
- string create immutable object but builder and buffer both creates mutable objects
- string takes much more memory when mutated explicitly. however in string buffer it never creates new object whenever we change the value it's going to change it in the original value itself. Hence consumes less memory. same as buffer in the case of string builder
- string are not thread safe/non-synchronized. in string buffer they are synchronized and thread safe. builder they are not synchronized and not thread safe
- performance of string is slow. buffer is fast as compared to string. builder is even more fast as compared to buffer

Q- What is the difference between == and .equals ?

- == is used for reference comparision/address comparision and it's coming from equals method of object class.
  ex-
  public static void main(String[] args){
  String s1 = new String("deepak");
  String s2 = s1; // new String("deepak");

  System.out.println(s1 == s2); // false

}

- .equals is object class method and there are 11 methods of object class they are all written below.
- clone(), equals(Object obj), finalize(), getClass(), hashCode(), notify(), notify All(), toString(), wait(), wait(long timeout), wait(long timeout int nanos)
- "this" keyword refers to current class instance variable or method or constructor.
- there is method overriding happening inside in string class where class string extends Object
- .equals() of string class compares value and it's case sensitive
- .equals methods is of two class object(==) class and string(.equals) class
ex-
        public static void main(String[] args){
        String s1 = new String("deepak");
        String s2 = new String("deepak");
        System.out.println(s1.equals(s2)); // true
}

- but this .equal of string method will return false if I compare deepak to Deepak. So it's case sensitive. to counter that they came up with another method which is equalsIgnoreCase() and this will return true for deepak to Deepak. So this method is comparision methods but case insensitive.and comparision happens lexicographically

Q- compareTo in java ?
-  public static void main(String[] args){
        String s1 = new String("deepak");
        String s2 = new String("deepak");
        System.out.println(s1.compareTo(s2)); // 5 and -5 if we do opposite and 0 if strings are equal in length
}

- this is used to compare the length of strings whether they are large or small or equal. 
- compareTo is case sensitive
- compareToIgnoreCase() is case insensitive. And comparision happens lexicographically

public static void main(String[] args){
      String s1 = new String("A");   // A = 65 unicode 
      String s2 = new String("a");   // a = 97 unicode
      System.out.println(s1.compareToIgnoreCase(s2)); // -32 (s1 - s2)
} 

--------------------------------------------------------------------------------------------------------------------------------------------------------------------
Q- what is diamond problem in java ?
- why multiple inheritance is not allowed in java it's explaination is known as diamond problem in java. they donot allow multiple inheritance in java because let's say class C extends A,B{} now signature of methods defined inside them are same so JVM will get confused what method to call and this is called as diamond problem in java. 

- The solution to the diamond problem is default methods and interfaces. We can achieve multiple inheritance by using these two things.

Q- what is primitve type casting in java ?
- converting one data type to another data type is called type casting.
It is of two types: 1) implicit 2) explicit

1) implicit(widening) : It is automatically performed by compiler. Converting a lower data type into a higher one is called widening type casting.
ex- 
public static void main(String[] args){
    int a = 9;
    double b = a;
    System.out.println(b); // 9.0
} 

2) explicit(Narrowing) : Converting a higher data type into a lower one is called narrowing type casting.
ex-
public static void main(String[] args){
    double a = 9.5;
    int b = (int)a;
    System.out.println(b); // 9
} 

Q- What is wrapper class in java ?
- converting primitive into an object and an object into primitive is done using wrapper class 

Q- What are data types in java ?
- primitive and non primitive

primitive are further divided into two parts : numeric and Non numeric 
numeric : they are further divided into two parts : Integeric and Decimal
Integeric : byte, short, int, long.
Decimal : float and double.
non-numeric : char and boolean

Non primitive : Strings and Arrays