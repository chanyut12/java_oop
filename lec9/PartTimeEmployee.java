package week9;

public class PartTimeEmployee extends Person {
    private double payRate ; 
    private double hoursWorked ; 
    PartTimeEmployee(){
        super();
        payRate = 0 ;
        hoursWorked = 0 ;
    }
    PartTimeEmployee(String firstname , String lastname , double payRate , double hoursWorked){
        super(firstname, lastname);
        this.payRate = payRate ; 
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return (super.toString() + "wages are:  $" + calculatePay());
    }
    public void setNameRateHours(String firstname , String lastname , double payRate , double hoursWorked){
        super.setName(firstname, lastname);
        this.payRate = payRate ;
        this.hoursWorked = hoursWorked ;
    }
    public double getPayRate() {
        return payRate;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public void setRateAndHours(double payRate , double hoursWorked){
        this.payRate = payRate;
        this.hoursWorked = hoursWorked ;
    }

    public double calculatePay(){
        return payRate * hoursWorked ;
    }

    public static void main(String[] args) {
           
    PartTimeEmployee p1 = new PartTimeEmployee(); 
    p1.setNameRateHours("SomChai", "Jaidee ", 20, 5); 
    p1.calculatePay(); 
    System.out.println(p1); 
   
    PartTimeEmployee p2 = new PartTimeEmployee("Harry", "Porter", 100, 5); 
    p2.calculatePay(); 
    System.out.println(p2); 

    p2.setHoursWorked(20); 
    p2.calculatePay(); 
    System.out.println(p2); 
     
    p1.setPayRate(100); 
    p1.setHoursWorked(3); 
    System.out.println(p1); 
     
    PartTimeEmployee p3 = new PartTimeEmployee("Somsak", "Seesai ", 0, 0); 
    p3.setLastname("SeeSaArd"); 
    p3.setRateAndHours(35, 12); 
    System.out.println(p3);
    }
}
