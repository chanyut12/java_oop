import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // System.out.println("Enter username"); 
        // String userName = myScanner.nextLine();
        System.out.println("The number of Unit"); 
        int unit = myScanner.nextInt();
        double result;

        if (unit >= 0 & unit <= 150) {
            result = 2.50 * unit;
        } else if (unit >= 151 & unit <= 400) {
            result = 3.50 * unit;
        } else {
            result = (4.50 * unit) - (4.50 * unit)*0.05;
        }
           
        System.out.println(result);

        myScanner.close();
    }
}

