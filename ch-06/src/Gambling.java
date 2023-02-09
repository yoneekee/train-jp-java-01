import java.util.Scanner;

class Person {

  private String name;
  private int[] gameResult = new int[3];
  Scanner sc = new Scanner(System.in);

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public int[] getGameResult() {
    return this.gameResult;
  }

  public int[] playGamble() {
    System.out.print("[ " + name + " ] (Enter) >> ");
    sc.nextLine();

    for (int i = 0; i < gameResult.length; i++) {
      gameResult[i] = (int) ((Math.random()) * 3) + 1;
    }

    if (!jackpot(gameResult)) {
      for (int i = 0; i < gameResult.length; i++) {
        System.out.print("\t" + gameResult[i] + "  ");
      }
      System.out.println(" ( " + name + " 님 이겼습니다. ) ");
    } else {
      for (int i = 0; i < gameResult.length; i++) {
        System.out.print("\t" + gameResult[i] + "  ");
      }
      System.out.println(" ( " + name + " 님 아쉽군요! ) ");
    }

    return gameResult;
  }

  public boolean jackpot(int[] gameResult) {
    int num = gameResult[0];

    for (int i = 0; i < gameResult.length; i++) {
      if (gameResult[i] != num) {
        return true;
      }
    }

    return false;
  }
}

public class Gambling {

  public static void main(String[] args) {
    Person p1 = new Person("수희");
    Person p2 = new Person("연수");

    while (true) {
      int[] res1 = p1.playGamble();
      if (!p1.jackpot(res1)) {
        System.out.println(p1.getName() + " 님의 승리로 종료");
        break;
      }

      int[] res2 = p2.playGamble();
      if (!p2.jackpot(res2)) {
        System.out.println(p2.getName() + " 님의 승리로 종료");
        break;
      }
    }
  }
}
