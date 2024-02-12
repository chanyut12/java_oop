public class diamond {

  public static void main(String[] args) {
    int n = 5; // Change this to change the size of the diamond

    // Loop for upper triangle
    for (int i = 1; i <= n; i++) {
      // Print spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }

      // Print stars
      for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
      }

      System.out.println();
    }

    // Loop for lower triangle
    for (int i = n - 1; i >= 1; i--) {
      // Print spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }

      // Print stars
      for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }
}

