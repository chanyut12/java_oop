package week10;

public class CommissionEmployeeTest {
    public static void main( String args[] )  
    { 
 CommissionEmployee employee = new CommissionEmployee(  
          "Sue", "Jones", "222-22-2222", 10000, .06 ); 
       System.out.println(  
          "Employee information obtained by get methods: \n" ); 
       System.out.printf( "%s %s\n", "First name is", 
          employee.getFirstName() ); 
       System.out.printf( "%s %s\n", "Last name is",  
          employee.getLastName() ); 
       System.out.printf( "%s %s\n", "Social security number is",  
          employee.getSocialSecurityNumber() ); 
       System.out.printf( "%s %.2f\n", "Gross sales is",  
          employee.getGrossSales() ); 
       System.out.printf( "%s %.2f\n", "Commission rate is", 
          employee.getCommissionRate() ); 
       employee.setGrossSales( 500 ); // set gross sales 
       employee.setCommissionRate( .1 ); // set commission rate 
       System.out.printf( "\n%s:\n\n%s\n",  
          "Updated employee information obtained by toString", employee ); 
    } // end main 
}
