package week10;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary ;
    BasePlusCommissionEmployee(){
        super();
        baseSalary = 0 ;
    }

    BasePlusCommissionEmployee(String first, String last, String ssn,  
    double sales, double rate  , double baseSalary){
        super(first, last, ssn, sales, rate);
        setBasesalary(baseSalary);
    }
    
    public void setBasesalary(double baseSalary){
        this.baseSalary = (baseSalary < 0.0) ? 0.0 : baseSalary;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    @Override
    public double earnings(){
        return getBaseSalary() + super.earnings() ;
    }
    @Override
    public String toString() 
    { 
        return String.format( "%s %s\n%s: %.2f", "base-salaried",  
            super.toString(), "base salary", getBaseSalary() ); 
    }

    public static void main( String args[] )  
   { 
      // instantiate BasePlusCommissionEmployee4 object 
      BasePlusCommissionEmployee employee =  new BasePlusCommissionEmployee(  
"Bob", "Lewis", "333-33-3333", 5000, .04, 300 ); 
      // get base-salaried commission employee data 
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
      System.out.printf( "%s %.2f\n", "Base salary is", 
         employee.getBaseSalary() ); 
      System.out.printf( "%s %.2f\n", "Total is", 
         employee.earnings() ); 
      employee.setBasesalary( 1000 ); // set base salary 
      System.out.printf( "\n%s:\n\n%s\n",  
         "Updated employee information obtained by toString",   
employee.toString() ); 
      System.out.printf( "%s %.2f\n", "Total is",employee.earnings() ); 
   } // end main

    
}
