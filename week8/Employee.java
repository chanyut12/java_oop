package week8;
public class Employee {
    private String firstname ;
    private String lastname ;
    private double salary ;


    public Employee(String firstname, String lastname, double salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    } 
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    } 
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }



    public static void main(String[] args) {
        Employee em1 = new Employee("Bob ", "Jones", 34500.00);
        Employee em2 = new Employee("Susan ", "Baker", 37809);

        System.out.println("Employee 1: " + em1.getFirstname() + em1.getLastname() + "Yearly salary: " + em1.getSalary());
        System.out.println("Employee 2: " + em2.getFirstname() + em2.getLastname() + "Yearly salary: " + em2.getSalary());

        System.out.println("Increasing employee salaries by 10% ");
        System.out.println("Employee 1: " + em1.getFirstname() + em1.getLastname() + "Yearly salary: " + em1.getSalary()*1.1);
        System.out.println("Employee 2: " + em2.getFirstname() + em2.getLastname() + "Yearly salary: " + em2.getSalary()*1.1);
    }
}
