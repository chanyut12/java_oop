package week5;

public class RectangleTest {
	public static void main(String[] args) {
	Rectangle rec2 = new Rectangle(2,3);
	Rectangle rec1 = new Rectangle();
    Rectangle rec3 = new Rectangle(10,10);
    

    System.out.println("Rectangle1 :: width =" + rec1.getWidth() + " height = " + rec1.getHeight());
	System.out.printf("Area = %,d%n", rec1.show_area());
	System.out.printf("Perimeter =  %,d%n" , rec1.perimeter());
    System.out.println("Rectangle1 :: width =" + rec2.getWidth() + " height = " + rec2.getHeight());
	System.out.printf("Area = %,d%n", rec2.show_area());
	System.out.printf("Perimeter =  %,d%n" , rec2.perimeter());
    System.out.println("Rectangle1 :: width =" + rec3.getWidth() + " height = " + rec3.getHeight());
	System.out.printf("Area = %,d%n", rec3.show_area());
	System.out.printf("Perimeter =  %,d%n" , rec3.perimeter());
	
	}

}


// public class RectangleTest {

//     public static void main(String[] args) {
//         Rectangle rec = new Rectangle(50, 10);
//         Rectangle rec1 = new Rectangle();

//         System.out.printf("The area of the first rectangle is %.2f%n", rec.calculateArea());
//         System.out.printf("The area of the second rectangle is %.2f%n", rec1.calculateArea());
//     }
// }

