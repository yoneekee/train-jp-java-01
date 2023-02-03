import java.util.Scanner;

/**
 * ScannerTest
 */
public class ScannerTest02 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    /** 두 자릿수 자연수 : 10의 자리 1의 자리 같은지 테스트 */
    System.out.print("두 자리수 자연수 입력 == > ");
    int num = sc.nextInt();
    int num1 = num / 10;
    int num2 = num - (num / 10) * 10;

    if (num > 99 || num < 0) {
      System.out.println("두 자리수 자연수만 입력해야 합니다.");
    } else if (num1 == num2) {
      System.out.println(
        "두 자릿수 정수의 10의 자리 숫자와 1의 자리 숫자가 동일합니다."
      );
      System.out.println("num 1 : " + num1 + " / num2 : " + num2);
    } else {
      System.out.println(
        "두 자릿수 정수의 10의 자리 숫자와 1의 자리 숫자가 동일하지 않습니다."
      );
      System.out.println("num 1 : " + num1 + " / num2 : " + num2);
    }

    sc.close();
  }
}
