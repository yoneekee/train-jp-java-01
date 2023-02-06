import java.util.Scanner;

public class DivideZeroHandling {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.print("첫번째 숫자 입력 >> ");
      int num01 = sc.nextInt();
      System.out.print("첫번째 숫자 입력 >> ");
      int num02 = sc.nextInt();
      double result = (double) (num01 / num02);

      try {
        if (result == 1) {
          break;
        }
      } catch (Exception e) {
        System.out.println("0으로 나눌 수 없습니다.");
        System.out.println(e.getMessage());
        System.out.println(e.getStackTrace());
      } finally {
        System.out.println(num01 + "을 " + num02 + "로 나누면 " + result);
      }
    }

    sc.close();
  }
}
