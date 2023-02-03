//import java.util.Random;
import java.util.Scanner;

public class ScannerTest08 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 랜덤플레이하려면
    // Random rd = new Random();
    // String[] items = { rock, sci, paper };
    // String chul = items[rd.nextInt(3)];
    // String yung = items[rd.nextInt(3)];

    String rock = "바위";
    String sci = "가위";
    String paper = "보";

    System.out.print("철수는 >>> ");
    String chul = sc.next();

    System.out.print("영희는 >>> ");
    String yung = sc.next();

    System.out.println(
      "철수가 낸 것 : " + chul + ", " + " 영희가 낸 것 : " + yung
    );

    if (
      (chul.equals(rock) && yung.equals(sci)) ||
      (chul.equals(sci) && yung.equals(paper)) ||
      (chul.equals(paper) && yung.equals(rock))
    ) {
      System.out.println("철수가 이김");
    } else if (
      (yung.equals(rock) && chul.equals(sci)) ||
      (yung.equals(sci) && chul.equals(paper)) ||
      (yung.equals(paper) && chul.equals(rock))
    ) {
      System.out.println("영희가 이김");
    } else if (chul.equals(yung)) {
      System.out.println("비김");
    }

    sc.close();
  }
}
