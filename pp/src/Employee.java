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

}
