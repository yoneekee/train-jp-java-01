import java.util.Scanner;

public class ScannerTest03 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("갖고 있는 돈을 입력하세요 => ");
    int money = sc.nextInt();

    int money50000 = money / 50000;
    money %= 50000;
    int money10000 = money / 10000;
    money %= 10000;
    int money5000 = money / 5000;
    money %= 5000;
    int money1000 = money / 1000;
    money %= 1000;
    int money500 = money / 500;
    money %= 500;
    int money100 = money / 100;
    money %= 100;
    int money50 = money / 50;
    money %= 50;
    int money10 = money / 10;
    money %= 10;

    System.out.println(
      // prettier-ignore
        "5만원권 : " + money50000 + "\n" +
        "1만원권 : " + money10000 + "\n" +
        "5천원권 : " + money5000 + "\n" +
        "1천원권 : " + money1000 + "\n" +
        "5백원권 : " + money500 + "\n" +
        "1백원권 : " + money100 + "\n" +
        "50원권 : " + money50 + "\n" +
        "10원권 : " + money10 + "\n"
    );

    sc.close();
  }
}
