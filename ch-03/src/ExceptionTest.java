import java.util.Scanner;

public class ExceptionTest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num01;
    int num02;
    System.out.print("첫 번째 수 입력 >>> \t");
    num01 = sc.nextInt();
    System.out.print("두 번째 수 입력 >>> \t");
    num02 = sc.nextInt();
    System.out.println("num01 + num02 = " + num01 + num02);
    sc.close();
  }
}
