
Inheritance :- Inheritance is a technique of acquiring the properties of another class having features in common. It allows us to increase the reusability and reduce the duplication of code. It is also known as a child-parent relationship, where a child inherits the properties of its parent. This is the reason it is called ‘is-a relationship’ where the child is-a type of parent.


Without Inheritance:

/**
public class Rectangle {

  private int width;
  private int height;

  public Rectangle(int width, int height) {
	this.width = width;
	this.height = height;
  }

  public int getArea() {
	return width * height;
  }
}

public class Square {

  private int width; // Duplicate property, also used in class Rectangle

  public Square(int width) { 
	this.width = width;
  }

  public int getArea() { // Duplicate method, similar to the class Rectangle
	return this.width * this.width;
  }
}

*/

The two classes are similar have the width property and the getArea() method in common. We can increase the reusability of the code by doing a small refactor where class Square ends up inheriting the class Rectangle.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

With Inheritance:

/**

public class Rectangle {

  private int width;
  private int height;

  public Rectangle(int width, int height) {
	this.width = width;
	this.height = height;
  }

  public int getArea() {
	return width * height;
  }
}

public class Square extends Rectangle {

  public Square(int width) {
	super(width, width); // A rectangle with the same height as width is a square
  }
}

*/

Just by extending the class Rectangle, the class Square now is-a type of Rectangle. This means it has inherited all the properties that are common between the Square and Rectangle.

------------------------------------------------------ javaTpoint -------------------------------------------------------------------------------------------------
Q- what is inheritance 
- you can create new classes upon existing classes
- when you inherit existing class you can reuse methods and fields on parent class
- you can add new methods and fields in your current class also.
- Inheritance represents the IS-A relationship which is also known as a parent-child relationship.
- Fields − Variables of a class i.e. instance variables and static variables are called fields.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
Q- what did you understood in inheritance write in your own language ?
- say for example I have employee class now I will create another class of programmer employee me me default chije dal dunga.
programmer class ko extend karunga to employee and then we use employee class ke methods variables + we can create new methods here in programmer class. So we can customise our object in whatever way we want. and can change it's state and behaviour. below is the example 

class Employee{  
    float salary=40000;  
}  

class Programmer extends Employee{  
    int bonus=10000;  
    public static void main(String args[]){  
      Programmer p=new Programmer();  
      System.out.println("Programmer salary is:"+p.salary);  
      System.out.println("Bonus of Programmer is:"+p.bonus);  
   }  
};

// In the above example, Programmer object can access the field of own class as well as of Employee class i.e. code reusability.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------
Q- Types of inheritance in c++ and java
In c++
- single inheritance/ simple inheritance 
- multi-level inheritance
- multiple inheritance
- hierarachical inheritance 
- hybrid inheritance 

In Java
- Class based supported inheritance in java :- single, multilevel and hierarchical
- you can't implement them through class so they came up with new concept called Interface. Multiple and Hybrid inheritance is supported through interface only. 

--------------------------------------------------------------------------------------------------------------------------------------------------------------------
Q- what is single inheritance?
- when a class inherits another class, it is called as single inheritance. Look at below example.

class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
class TestInheritance{  
public static void main(String args[]){  
Dog d=new Dog();  
d.bark();  
d.eat();  
}}

So we have a class (using which we can create new object) inside that class we have defined fields(variables) and methods now we have created a new class and similarly have defined new methods inside it. Now we can create 

--------------------------------------------------------------------------------------------------------------------------------------------------------------------
Q- what is multilevel inheritance ?
- When there is a chain of inheritance, it is known as multilevel inheritance. As you can see in the example given below, BabyDog class inherits the Dog class which again inherits the Animal class, so there is a multilevel inheritance. Look at below example.

class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
class BabyDog extends Dog{  
void weep(){System.out.println("weeping...");}  
}  
class TestInheritance2{  
public static void main(String args[]){  
BabyDog d=new BabyDog();  
d.weep();  
d.bark();  
d.eat();  
}}  

--------------------------------------------------------------------------------------------------------------------------------------------------------------------
Q- what is Hierarchical Inheritance ?
- When two or more classes inherits a single class, it is known as hierarchical inheritance. In the example given below, Dog and Cat classes inherits the Animal class, so there is hierarchical inheritance. Look at below example.

class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
class Cat extends Animal{  
void meow(){System.out.println("meowing...");}  
}  
class TestInheritance3{  
public static void main(String args[]){  
Cat c=new Cat();  
c.meow();  
c.eat();  
//c.bark();//C.T.Error  
}}  

--------------------------------------------------------------------------------------------------------------------------------------------------------------------
Q- What is multilevel inheritance ?
- class C extends A,B{}
- we acheive it using interface. over there class implements interface. 


--------------------------------------------------------------------------------------------------------------------------------------------------------------------
Q- What is hybrid inheritance ? 
- 


--------------------------------------------------------------------------------------------------------------------------------------------------------------------
Q- What is Interface ?
- Using interface we implement multiple and hybrid inheritance. 
- It only contains abstract method. you can't keep normal method inside interface.
- interface "methods" are by default public and abstract. 
- interface "variables" are by default public static and final. 
- 


--------------------------------------------------------------------------------------------------------------------------------------------------------------------
Q- What is aggregation(has-A)
- Aggregation represents HAS-A relationship.
- We use aggregation For Code Reusability.
- If a class have an entity reference, it is known as Aggregation.

ex- 
class Employee{  
int id;  
String name;  
Address address;//Address is a class  

}  

In such case, Employee has an entity reference address, so relationship is Employee HAS-A address.

