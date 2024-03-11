public class BasePlusCommissionEmployee2 {

    private CommissionEmployee commissionEmployee; // CommissionEmployee object
    private double baseSalary;

    public BasePlusCommissionEmployee2() {
        commissionEmployee = new CommissionEmployee(); // Create a CommissionEmployee object
        baseSalary = 0.0;
    }

    public BasePlusCommissionEmployee2(String first, String last, String ssn,
                                      double sales, double rate, double baseSalary) {
        commissionEmployee = new CommissionEmployee(first, last, ssn, sales, rate);
        setBaseSalary(baseSalary);
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = (baseSalary < 0.0) ? 0.0 : baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // Delegate methods to CommissionEmployee object
    public String getFirstName() {
        return commissionEmployee.getFirstName();
    }

    public void setFirstName(String firstName) {
        commissionEmployee.setFirstName(firstName);
    }

    public String getLastName() {
        return commissionEmployee.getLastName();
    }

    public void setLastName(String lastName) {
        commissionEmployee.setLastName(lastName);
    }

    public String getSocialSecurityNumber() {
        return commissionEmployee.getSocialSecurityNumber();
    }

    public void setSocialSecurityNumber(String ssn) {
        commissionEmployee.setSocialSecurityNumber(ssn);
    }

    public double getGrossSales() {
        return commissionEmployee.getGrossSales();
    }

    public void setGrossSales(double sales) {
        commissionEmployee.setGrossSales(sales);
    }

    public double getCommissionRate() {
        return commissionEmployee.getCommissionRate();
    }

    public void setCommissionRate(double rate) {
        commissionEmployee.setCommissionRate(rate);
    }

    public double earnings() {
        return getBaseSalary() + commissionEmployee.earnings();
    }

    public String toString() 
    { 
       return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",  
          "commission employee", commissionEmployee.getFirstName(), commissionEmployee.getLastName(),  
          "social security number", commissionEmployee.getSocialSecurityNumber(),  
          "gross sales", commissionEmployee.getGrossSales(),  
          "commission rate", commissionEmployee.getCommissionRate()); 
    } 

    public static void main( String args[] )
    {
    // instantiate BasePlusCommissionEmployee4 object
    BasePlusCommissionEmployee employee =
    new BasePlusCommissionEmployee(
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
