// Lab 1: AccountTest.java
// Create and manipulate an Account object.


public class AccountTest
{
   // main method begins execution of Java application
   public static void main( String args[] ) 
   {
      Account account1 = new Account(50.00); // create Account object
      System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
      
       
      Account account2 = new Account(-7.53); // create Account object
      System.out.printf( "account2 balance: $%.2f\n", account2.getBalance() );

      account1.credit(50);
      System.out.println(account1.getBalance());
     
   } // end main

} // end class AccountTest


