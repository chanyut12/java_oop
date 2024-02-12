import java.util.Scanner;

public class createArrays {
    public static void main(String[] args) {
        double[] list = new double[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            list[i]  = input.nextInt();
        }
        list[9] = 5.5;
        System.out.println(java.util.Arrays.toString(list));

        System.out.println("สองตัวแรก " + (list[0]+list[1]));

        double sum = 0;
        for (double i : list) {
            sum += i;
        }
        System.out.println("SUM " + sum );

        double min = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] < min) {
               min = list[i];
            }             
        }
        System.out.println("MIN " + (list[0]+list[1]));
         

        input.close();
    }
}
