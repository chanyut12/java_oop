import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i]  = scanner.nextInt();
        }
        System.out.println(java.util.Arrays.toString(num));

        int[] renum = new int[num.length];    
        for (int i = num.length - 1, j = 0; i >= 0; i--, j++) {
            renum[j] = num[i];
        }
        System.out.println(java.util.Arrays.toString(renum));
                
        scanner.close();
    }
}

