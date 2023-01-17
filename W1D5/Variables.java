// there are 3 types of variables local, static, instance variables

/*
Local variables :- All variables which are declared inside the “method”. A local variable cannot be defined with "static" keyword.
Static variables :- A variable which is declared with static keyword is called static variable. we do not need to create object instead we can access them directly from the class. this can be both inside or outside the method. You can access fields/methods using the class name
instance variables :- All variables which are declared inside the “class” or outside the methods. we have to create an object to access them. instance variables are created inside heap memory because they are for objects. 

*/



class Variables{

    static int b = 20; // static variable 
    int c = 30; // instance variable
    public static void main(String[] args) {
        
        Variables check = new Variables();
        int a = 10; // local variable
        System.out.println(a); // accessing local variable
        System.out.println(Variables.b); // accessing static variable
        System.out.println(check.c); // accessing instance variable

    }
}

