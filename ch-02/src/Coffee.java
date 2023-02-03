import java.util.Scanner;

public class Coffee {

  public static void main(String[] args) {
    int capuccino = 3500;
    int espresso = 3200;
    int cafelatte = 4000;
    int americano = 2000;

    Scanner sc = new Scanner(System.in);
    System.out.print("내 예산은 : ");
    int myMoney = sc.nextInt();
    String menu;

    while (myMoney >= americano) {
      System.out.println(
        "뭘 주문하시겠습니까? (아메리카노, 에스프레소, 카페라떼, 카푸치노)"
      );
      menu = sc.next();

      switch (menu) {
        case "카푸치노":
          if (myMoney - capuccino < 0) {
            System.out.println(
              "남은 예산 : " +
              myMoney +
              ", 선택한 메뉴 가격 : " +
              capuccino +
              " / 예산부족, 메뉴 재선택 요망"
            );
            break;
          }
          myMoney -= capuccino;
          System.out.println("남은 예산 : " + myMoney);
          break;
        case "에스프레소":
          if (myMoney - espresso < 0) {
            System.out.println(
              "남은 예산 : " +
              myMoney +
              ", 선택한 메뉴 가격 : " +
              espresso +
              " / 예산부족, 메뉴 재선택 요망"
            );
            break;
          }
          myMoney -= espresso;
          System.out.println("남은 예산 : " + myMoney);
          break;
        case "카페라떼":
          if (myMoney - cafelatte < 0) {
            System.out.println(
              "남은 예산 : " +
              myMoney +
              ", 선택한 메뉴 가격 : " +
              cafelatte +
              " / 예산부족, 메뉴 재선택 요망"
            );
            break;
          }
          myMoney -= cafelatte;
          System.out.println("남은 예산 : " + myMoney);
          break;
        case "아메리카노":
          if (myMoney - americano < 0) {
            System.out.println(
              "남은 예산 : " +
              myMoney +
              ", 선택한 메뉴 가격 : " +
              americano +
              " / 예산부족, 메뉴 재선택 요망"
            );
            break;
          }
          myMoney -= americano;
          System.out.println("남은 예산 : " + myMoney);
          break;
        default:
          System.out.println("올바른 선택이 아닌듯. 다시 선택하세요.");
          break;
      }
    }

    System.out.println("돈 다 떨어지신듯.");
    sc.close();
  }
}
