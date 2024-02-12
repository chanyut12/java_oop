// Lab 1: AccountTest.java
// Create and manipulate an Account object.


public class AccountTest
{
   // main method begins execution of Java application
   public static void main( String args[] ) 
   {
      Account account1 = new Account(1000); // create Account object
      System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
      
       
      Account account2 = new Account(-7.53); // create Account object
      System.out.printf( "account2 balance: $%.2f\n", account2.getBalance() );
       
     
   } // end main

} // end class AccountTest
