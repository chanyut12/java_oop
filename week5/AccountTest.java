package week5;
// Lab 1: AccountTest.java
// Create and manipulate an Account object.
import java.util.Scanner;

public class AccountTest
{
   // main method begins execution of Java application
   public static void main( String args[] ) 
   {
      Scanner input = new Scanner(System.in);
      Account account1 = new Account(50.00); // create Account object
      System.out.printf( "account1 balance: $%.2f\n", account1.getBalance());
      System.out.print("Enter credit amount for account 1: ");
      double acc1 = input.nextDouble();
      System.out.printf("Adding %.2f to account1 balance%n" , acc1);
      account1.credit(acc1);
      System.out.println("account1 balance: $" + account1.getBalance());
       
      Account account2 = new Account(70.00); // create Account object
      System.out.printf( "account2 balance: $%.2f\n", account2.getBalance());
      System.out.print("Enter credit amount for account 1: ");
      double acc2 = input.nextDouble();
      System.out.printf("Adding %.2f to account1 balance%n" , acc2);
      account2.credit(acc2);
      System.out.println("account1 balance: $" + account2.getBalance());

      // account1.withdraw(20.00);
      // System.out.println(account1.getBalance());
      input.close();
     
   } // end main

} // end class AccountTest


