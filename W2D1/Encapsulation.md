
Encapsulation :- restricting a user from directly modifying the data members or variables of a class in order to maintain the integrity of the data. We do this by switching the access-modifier to private and exposing public methods that we can use to access the data.


Without encapsulation:

/**
public class Account {

  public double balance;
  
  public static void main(String[] args) {
  	
  	Account theGeekyAsianAccount = new Account();
  	
  	theGeekyAsianAccount.balance = -54;
  }
}
*/

In the above code snippet, the main() method accesses the balance variable directly. It allows a user to set any double value to the balance variable of the Account class. We can lose the integrity of the data by allowing anyone to set balance value as anything invalid number e.g. -54 in this case.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

With Encapsulation:

/**
public class Account {

  private double balance;

  public void setBalance(double balance) {

    if(balance < 0) { // Validating input data in order to maintain data integrity
	  throw new IllegalArgumentException("Balance cannot be less than zero (0)");
    }
    this.balance = balance;
  }
  
  public static void main(String[] args) {
  	
  	Account theGeekyAsianAccount = new Account();
  	
  	theGeekyAsianAccount.setBalance(1); // Valid input - Allowed
  	theGeekyAsianAccount.setBalance(-55); // Stops user and throws exception
  }
}
*/

In this code, we have restricted access to the balance variable and added a setBalance() method to allow users to set the value of the Account balance. The setter validates the value provided before assigning it to the balance variable. If the value is any number lesser than zero, it throws an exception. This makes sure that the integrity data is not compromised.

In simple words : we do not want user to directly modify the data so we can control it with these keywords private and public. Instead we will allow the user to go through methods which are public and modify data through those public methods. It will help us maintain the integrity of the data.