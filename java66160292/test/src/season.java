import java.util.Scanner;

public class season {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); 
       System.out.print("input Month(1-12) : ");
       int month = scanner.nextInt();
       switch (month) {
        case 12,1,2:  System.out.println("Winter");  break;    
        case 3,4,5:   System.out.println("Spring");  break; 
        case 6,7,8:   System.out.println("Summer");  break;    
        case 9,10,11: System.out.println("Autumn");  break;    

        default: System.out.println("Invalid month number"); break;
       }
       scanner.close();
    }
}
