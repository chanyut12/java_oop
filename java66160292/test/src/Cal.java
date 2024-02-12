import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter fisrt number  ");
        float num1 = scanner.nextInt();
        System.out.println("Enter second number  ");
        float num2 = scanner.nextInt();
        System.out.println("Enter (+ - * /)");
        char condition = scanner.next().charAt(0);
        float result = 0;
        switch (condition) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1  * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        
            default:
                System.out.println("Try again!");
                break;
        }
        System.out.println("result = " + result);
        
        scanner.close();
    }
}
