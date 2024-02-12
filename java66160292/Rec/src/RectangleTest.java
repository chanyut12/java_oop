public class RectangleTest {
    public static void main( String args[] ) {
      Rectangle Rectangle1 = new Rectangle(5,5); 
      System.out.printf( "area1: $%.2f\n", Rectangle1.Cal() );
      
       
      Rectangle Rectangle2 = new Rectangle(); 
      System.out.printf( "area2: $%.2f\n", Rectangle2.Cal() );
       
   } 
}
