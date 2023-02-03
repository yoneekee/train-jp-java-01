import java.util.Scanner;

public class ScannerTest04 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("1-99 중 하나 입력 = > ");
    int num = sc.nextInt();

    if (num < 0 || num > 99) {
      System.out.println("범위 잘못됨");
    } else if ((num / 10) % 3 != 0 && num % 3 == 0) {
      System.out.println("박수 짝");
    } else if ((num / 10) % 3 == 0 && num % 3 == 0) {
      System.out.println("박수 짝짝");
    }

    sc.close();
  }
}
