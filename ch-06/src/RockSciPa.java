import java.util.Scanner;

class Player {

  Scanner sc = new Scanner(System.in);
  private String name;

  public Player(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public int turn() {
    System.out.print(
      name + ", [가위(1), 바위(2), 보(3), 끝내기(4)] 중 하나를 내세요 >> "
    );
    return sc.nextInt();
  }
}

class Computer extends Player {

  public Computer(String name) {
    super(name);
  }

  @Override
  public int turn() {
    return (int) (Math.random() * 3) + 1;
  }
}

public class RockSciPa {

  public static void main(String[] args) {
    String str[] = { "가위", "바위", "보", "그만" };

    System.out.println("3선승제 게임 시작");
    Player pl = new Player("yonee");

    Computer cp = new Computer("computer");

    int plWin = 0;
    int comWin = 0;

    while (true) {
      int plNum = pl.turn();
      int comNum = cp.turn();
      String plResult = "";
      String comResult = "";

      if (plNum == 1) plResult = str[0];
      if (plNum == 2) plResult = str[1];
      if (plNum == 3) plResult = str[2];
      if (plNum == 4) plResult = str[3];

      if (comNum == 1) comResult = str[0];
      if (comNum == 2) comResult = str[1];
      if (comNum == 3) comResult = str[2];
      if (comNum == 4) comResult = str[3];

      if (plNum == 4) {
        System.out.println("게임 종료");
        break;
      }

      // prettier-ignore
      if (
        (plNum == 1 && comNum == 3) ||
        (plNum == 2 && comNum == 1) ||
        (plNum == 3 && comNum == 2)
      ) {
        System.out.println(
          "플레이어 승 // " + "player : " + plResult + ", computer : " + comResult
        );
        plWin++;
      } else if (
        (comNum == 1 && plNum == 3) ||
        (comNum == 2 && plNum == 1) ||
        (comNum == 3 && plNum == 2)
      ) {
        System.out.println(
          "컴퓨터 승 // " + "player : " + plResult + ", computer : " + comResult
        );
        comWin++;
      } else if (comNum == plNum) {
        System.out.println(
          "무승부 // " + "player : " + plResult + ", computer : " + comResult
        );
      } else if (comNum < 0 || plNum < 0 || plNum > 4 || comNum > 3) {
        System.out.println("입력값의 범위가 바르지 아니함");
      }

      // prettier-ignore
      if (plWin >= 3) {
        System.out.println("최종 플레이어 승. 게임 종료." + " // playerWin : " + plWin + ", computerWin : " + comWin);
        break;
      } else if (comWin >= 3) {
        System.out.println("최종 컴퓨터 승. 게임 종료." + " // playerWin : " + plWin + ", computerWin : " + comWin);
        break;
      }
    }
  }
}
