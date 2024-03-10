package week10;

public class CommissionEmployee  
{ 
   private String firstName; 
   private String lastName; 
   private String socialSecurityNumber;  
   private double grossSales;  
   private double commissionRate;  
// gross weekly sales ยอดขายต่อสัปดาห์ 
// commission percentage ค่าคอมมิชชัน 
public CommissionEmployee(){
    
}
public CommissionEmployee( String first, String last, String ssn,  
      double sales, double rate ) 
   { 
      firstName = first; 
      lastName = last; 
      socialSecurityNumber = ssn; 
      setGrossSales(sales);       
setCommissionRate(rate); 
   } 
   public void setFirstName( String first ) 
   { 
      firstName = first; 
   } 
   public String getFirstName() 
   { 
      return firstName; 
   } 
 public void setLastName( String last ) 
   { 
      lastName = last; 
   } 
   public String getLastName() 
   { 
      return lastName; 
   } 
   public void setSocialSecurityNumber( String ssn ) 
   { 
      socialSecurityNumber = ssn; 
   }  
   public String getSocialSecurityNumber() 
   { 
      return socialSecurityNumber; 
   } 
   public void setGrossSales( double sales ) 
   { 
      grossSales = ( sales < 0.0 ) ? 0.0 : sales; 
   } 
   public double getGrossSales() 
   { 
      return grossSales; 
   } 
   public void setCommissionRate( double rate ) 
   { 
      commissionRate = ( rate > 0.0 && rate < 1.0 ) ? rate : 0.0; 
   } // end method setCommissionRate 
   public double getCommissionRate() 
   { 
      return commissionRate; 
   } 
// calculate commission employee's pay คํานวณค่าคอมมิชัน 
   public double earnings() 
   { 
      return commissionRate * grossSales; 
   } 
  public String toString() 
   { 
      return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",  
         "commission employee", firstName, lastName,  
         "social security number", socialSecurityNumber,  
         "gross sales", grossSales,  
         "commission rate", commissionRate ); 
   } // end method toString 
} // end class CommissionEmployee 
