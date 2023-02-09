import java.util.Scanner;

class Person2 {

  private String name;
  private int[] gameResult = new int[3];
  Scanner sc = new Scanner(System.in);

  public Person2(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int[] getGameResult() {
    return this.gameResult;
  }

  public int[] playGamble() {
    System.out.print(name + " 님 게임을 시작합니다 (Enter) >> ");
    sc.nextLine();

    for (int i = 0; i < gameResult.length; i++) {
      gameResult[i] = (int) ((Math.random()) * 3) + 1;
    }

    if (!jackpot(gameResult)) {
      for (int i = 0; i < gameResult.length; i++) {
        System.out.print("\t" + gameResult[i] + "\t");
      }
      System.out.println(" ( " + name + "님 이겼습니다. ) ");
    } else {
      for (int i = 0; i < gameResult.length; i++) {
        System.out.print("\t" + gameResult[i] + "\t");
      }
      System.out.println(" ( " + name + "님 아쉽군요! ) ");
    }

    return gameResult;
  }

  public boolean jackpot(int[] gameResult) {
    int num = gameResult[0];

    for (int i = 0; i < gameResult.length; i++) {
      if (gameResult[i] != num) {
        return true; // 게임에서 졌음
      }
    }

    return false; // 게임에서 이겼음
  }
}

public class Gambling2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("게임에 참가할 선수 숫자 >> ");
    int participants = scanner.nextInt();

    Person2[] players = new Person2[participants];

    for (int i = 0; i < players.length; i++) {
      System.out.print((i + 1) + " 번째 선수 이름 >> ");
      String name = scanner.next();
      players[i] = new Person2(name);
    }

    boolean gameEnding = true;

    while (gameEnding) {
      int res[] = {};
      for (int i = 0; i < players.length; i++) {
        res = players[i].playGamble();
        gameEnding = players[i].jackpot(res);
        if (!gameEnding) {
          System.out.println(players[i].getName() + " 님의 승리로 종료");
          break;
        }
      }
    }

    scanner.close();
  }
}
