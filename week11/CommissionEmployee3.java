package week11;

public class CommissionEmployee3 {
    private String firstName ;
    private String lastName ;
    private String socialSecurityNumber ; 
    private double grossSales ;
    private double commissionRate ;


    public CommissionEmployee3(String first , String last , String ssn , double sales , double rate){
        firstName = first; 
        lastName = last;
        socialSecurityNumber = ssn ;
        setGrossSales(sales);
        setCommissionRate(rate);
    }
    public void setGrossSales(double sales) {
        this.grossSales = (sales < 0.0) ? 0.0 : sales;
    }
    public void setCommissionRate(double rate) {
        this.commissionRate = (rate > 0.0 && rate < 1.0) ? rate : 0.0;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    public double getGrossSales() {
        return grossSales;
    }
    public double getCommissionRate() {
        return commissionRate;
    }
    public double earnings(){
        return getCommissionRate() * getGrossSales() ;
    }
    public String toString() 
   { 
    return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",  
    "commission employee", getFirstName(), getLastName(),  
    "social security number", getSocialSecurityNumber(),  
    "gross sales", getGrossSales(),  
    "commission rate", getCommissionRate() ); 
   } 

}
