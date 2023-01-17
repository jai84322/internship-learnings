Polymorphism:- polymorphism means “many forms”. That is one thing that can take many forms. 

Example : 
We all use a single button to switch ON and OFF the computer.
2) A boy starts his love by saying the word “friendship” but the girl ends that love with the same word “friendship”. The girl says that we will be always good friends. Here, the word “friendship” is the same but attitude is different.
3)  The best example of polymorphism is human behavior. One person can have different behavior. For example, a person acts as an employee in the office, a customer in the shopping mall, a passenger in bus/train, a student in school, and a son at home.

There are two types of polymorphism:
1) Method Overloading – Static Polymorphism (Static Binding)
2) Method Overriding – Dynamic Polymorphism (Dynamic Binding)


1) Mehtod Overloading: The method overloading or static polymorphism, also known as Static Binding, also known as compile-time binding is a type where method calls are defined at the time of compilation. Method overloading allows us to have multiple methods with the same name having different datatypes of parameter, or a different number of parameters, or both.

Without Method Overloading:

/**
public class Number {

  public void sumInt(int a, int b) {
	System.out.println("Sum: " + (a + b));
  }

  public void sumDouble(double a, double b) {
	System.out.println("Sum: " + (a + b));
  }

  public static void main(String[] args) {

	Number number = new Number();

	number.sumInt(1, 2);
	number.sumDouble(1.8, 2.5);
  }
}
*/

In the above example, we have created two methods with different names just to add two different kinds of numbers. If we continue with a similar implementation, we will end up having multiple methods with different names. This will decrease the code quality and accessibility. To improve this, we can use method overloading to use the same name for different methods. Which will allow the user to have a single option as an entry-point to perform sum on different kinds of numbers.

Method overloading works when two or more have the same name but different parameters. The return type can be the same as well as different. If two methods have the same name, same parameters but different return types, NO! That is not valid example of overloading, and will throw a compilation error.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

With Method Overloading:

/**
public class Number {

  public void sum(int a, int b) {
	System.out.println("Sum: " + (a + b));
  }

  public void sum(double a, double b) {
	System.out.println("Sum: " + (a + b));
  }

  public static void main(String[] args) {

	Number number = new Number();

	number.sum(1, 2);
	number.sum(1.8, 2.5);
  }
}

*/

In the same code, with a smaller tweak, we were able to overload both methods by making the name similar for both. The user can now provide their specific data types as parameters in the method. It would then perform the action based on their provided data type. This binding of methods is done at the time of compilation as the compiler knows which method will be called with the provided type of parameter. This is also why we call it compile-time binding.

********************************************************************************************************************************************************************

2) Method Overriding: In contrast to method overloading, method overriding allows you have to exactly the same signature as multiple methods, but they should be in multiple different classes. The question is how is this special? These classes have an IS-A relationship i.e. should have inheritance between them. In other words, in method overriding or dynamic polymorphism, methods are resolved dynamically at the runtime when the method is called. This is done based on the reference of the object it is initialized with.

/**

public class Animal {

  public void walk() {
	System.out.println("Animal walks");
  }
}

public class Cat extends Animal {

  @Override
  public void walk() {
	System.out.println("Cat walks");
  }
}

public class Dog extends Animal {

  @Override
  public void walk() {
	System.out.println("Dog walks");
  }
}

public class Main {

  public static void main(String[] args) {

	Animal animal = new Animal();
	animal.walk(); // Animal walks

	Cat cat = new Cat();
	cat.walk(); // Cat walks

	Dog dog = new Dog();
	dog.walk(); // Dog walks

	Animal animalCat = new Cat(); // Dynamic Polymorphism
	animalCat.walk(); // Cat walks
	
	Animal animalDog = new Dog(); // Dynamic Polymorphism
	animalDog.walk(); //Dog walks
  }
}

*/

In this example of overriding, we have dynamically assigned the ‘Dog’ and ‘Cat’ type objects to the Animal type. This enables us to call the walk() method of the referenced instances dynamically at the runtime. We can do this with the help of method overriding (or dynamic polymorphism).