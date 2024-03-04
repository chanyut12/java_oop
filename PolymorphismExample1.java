class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}

public class PolymorphismExample1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(2, 3));               // Calls int version
        System.out.println(calculator.add(2.5, 3.1));          // Calls double version
        System.out.println(calculator.add(10, 20, 30));        // Calls 3-argument version
    }
}

