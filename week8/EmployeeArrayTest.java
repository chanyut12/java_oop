package week8;
public class EmployeeArrayTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Elizabeth", "Moore",  70000);
        employees[1] = new Employee("Jennifer", "Davis",  100000);
        employees[2] = new Employee("James", "Brown",  40000);
        employees[3] = new Employee("John", "Miller",  120000);
        employees[4] = new Employee("Patricia", "Johnson",  60000);
        employees[5] = new Employee("Mary", "Williams",  50000);
        employees[6] = new Employee("William", "Taylor",  130000);
        employees[7] = new Employee("Robert", "Jones",  110000);
        employees[8] = new Employee("Michael", "Smith",  80000);
        employees[9] = new Employee("Linda", "Wilson",  90000 );

        for (Employee employee : employees) {
            double newSalary = employee.getSalary() * 1.05;
            employee.setSalary(newSalary);
        }

        for (Employee employee : employees) {
            System.out.println("name: " + employee.getFirstname() + " " + employee.getLastname());
            System.out.println("salary: " + employee.getSalary());
            System.out.println();
        }
    }
}
