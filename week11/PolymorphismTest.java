package week11;

public class PolymorphismTest {
    public static void main(String args[]) {
        // assign superclass reference to superclass variable
        CommissionEmployee3 commissionEmployee = new CommissionEmployee3(
                "Sue", "Jones", "222-22-2222", 10000, .06);
        // invoke toString on superclass object using superclass variable
        System.out.printf("%s %s:\n\n%s\n\n",
                "Call CommissionEmployee3's toString with superclass reference ",
                "to superclass object", commissionEmployee.toString());

        // assign subclass reference to subclass variable
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(
                "Bob", "Lewis", "333-33-3333", 5000, .04, 300);
        // invoke toString on subclass object using subclass variable
        System.out.printf("%s %s:\n\n%s\n\n",
                "Call BasePlusCommissionEmployee's toString with subclass",
                "reference to subclass object",
                basePlusCommissionEmployee.toString());
    }
}
