import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {
        Scanner Myobj = new Scanner(System.in);

        System.out.print("Enter the number of units consumed: ");
        int units = Myobj.nextInt();

        double billAmount = calculateBill(units);

        // Display the bill
        System.out.println("Electricity Bill Amount: BAHT " + billAmount);
    }

    private static double calculateBill(int units) {
        final double RATE_1 = 2.5;
        final double RATE_2 = 3.5;
        final double RATE_3 = 4.5;

        if (units <= 150) {
            return units * RATE_1;
        } else if (150 < units <= 400) {
            return units * RATE_2;
        } else {
            return units * RATE_3;
        }
    }
}
