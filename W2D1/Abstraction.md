
Abstraction is a technique of providing only the essential details to the user by hiding the unnecessary or irrelevant details of an entity. This helps in reducing the operational complexity at the user-end.

Abstraction enables us to provide a simple interface to a user without asking for complex details to perform an action. In simpler words, giving the user the ability to drive the car without requiring to understand tiny details of how does the engine work.

Abstraction makes technology easier to use. Imagine that you needed to know the low-level electronic details in order to turn your TV on to watch your favourite HBO show. The learning curve would be tremendous. Very few people would watch TV if that were the case.

/**
public class Car {

  public void lock() {}
  public void unlock() {}

  public void startCar() {

	checkFuel();
	checkBattery();
	whatHappensWhenTheCarStarts();
  }

  private void checkFuel() {
	// Check fuel level
  }

  private void checkBattery() {
	// Check car battery
  }

  private void whatHappensWhenTheCarStarts() {
	// Magic happens here
  }
}

*/

In the code above, the lock(), unlock() and startCar() methods are public, while the rest are private to the class. We have simplified the access of using the car to the user by handling the complex details internally. If a user was asked to checkFuel() and checkBattery() manually before startCar() that would increase the complexity at the user’s end. With the above code, all the user has to do is use startCar() and the rest will be taken care of by the class. This is what we call ‘abstraction’.

example-2 : A user does not need to know how a TV remote is working internally. He just needs to know the specific buttons to increase or decrease the volume or change the channels.

example-3 : Similar is the case with washing machine. A user Only needs to understand the buttons to start stop and pause. No need to understand their internal workings in order to use them.

----------------------------------------------------------------- JavaTpoint ---------------------------------------------------------------------------------------
Q- What is Abstraction and Abstract class and Abstract method in Java?

Abstraction : User has nothing to do with implementation details/internal processing of how things are working. so we want to hide those and only show functionality to the user. It lets us focus on what the object does instead of how it does it.

Abstract class : There is a keyword called abstract using which we declare abstract classes. It can have abstract and non-abstract methods. if you are using even a single method as abstract then its mandatory to make that class also abstract. 
rule : If you are extending an abstract class that has an abstract method, you must either provide the implementation of the method or make this class abstract.
ex- abstract class A{}  

Abstract method : A method which is declared as abstract and does not have implementation is known as an abstract method. It doesnot contain body. 
ex- abstract void printStatus();//no method body and abstract. Abstract methods have no bodies.

subclass = child
superclass = parent

ex- 
abstract class Bike{  
  abstract void run();  
}  
class Honda4 extends Bike{  
void run(){System.out.println("running safely");}  
public static void main(String args[]){  
 Bike obj = new Honda4();  
 obj.run();  // running safely
}  
}  

ex- 
abstract class Shape{  
abstract void draw();  
}  
//In real scenario, implementation is provided by others i.e. unknown by end user  
class Rectangle extends Shape{  
void draw(){System.out.println("drawing rectangle");}  
}  
class Circle1 extends Shape{  
void draw(){System.out.println("drawing circle");}  
}  
//In real scenario, method is called by programmer or user  
class TestAbstraction1{  
public static void main(String args[]){  
Shape s=new Circle1();//In a real scenario, object is provided through method, e.g., getShape() method  
s.draw();  
}  
}  


--------------------------------------------------------------------------------------------------------------------------------------------------------------------
Q- What is factory method in java and what is it's use in abstract class ?
- 


--------------------------------------------------------------------------------------------------------------------------------------------------------------------
Q- What is class ?
- Classes are used to create objects. This allows us to create dynamic objects/customized objects as per our requirement. also it provides reusability.  

ex- class Programming{
  String person = "developer";
  void main() {
    programming hello = new programming();
    System.out.println(hello);
  }
};

Q- What happens when we write abstract keyword in front of a class or method ? 
- Abstract classes cannot be instantiated, but they can be subclassed. The abstract keyword before classes restricts instantiation. And if we use abstract keyword before a method then it doesn't contain the body. abstract class can contain abstract and non abstract method both

difference between abstract class and interface ?
- 