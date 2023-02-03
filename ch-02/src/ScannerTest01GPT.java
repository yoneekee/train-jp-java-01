import java.util.Scanner;

public class ScannerTest01GPT {

  public static void main(String[] args) {
    // Create a Scanner object
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter three sides of the triangle
    System.out.print("Enter three sides of the triangle: ");
    double side1 = input.nextDouble();
    double side2 = input.nextDouble();
    double side3 = input.nextDouble();

    // Check if the inputs can make a triangle or not
    boolean validTriangle =
      (side1 + side2 > side3) &&
      (side2 + side3 > side1) &&
      (side1 + side3 > side2);

    // Display result
    if (validTriangle) {
      System.out.println("The three sides can make a triangle.");
    } else {
      System.out.println("The three sides cannot make a triangle.");
    }
    input.close();
  }
}
