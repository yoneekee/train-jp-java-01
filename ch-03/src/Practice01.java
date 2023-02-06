import java.util.Scanner;

public class Practice01 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 2
    /*int n[][] = { { 1 }, { 1, 2, 3 }, { 1 }, { 1, 2, 3, 4 }, { 1, 2 } };
    for (int i = 0; i < n.length; i++) {
      for (int j = 0; j < n[i].length; j++) {
        System.out.print(n[i][j] + " ");
      }
      System.out.println();
    }*/

    // 3
    /*System.out.println("숫자 입력 : ");
    int num01 = sc.nextInt();
    int num02 = num01;

    for (int i = 0; i < num01; i++) {
      for (int j = num02; j > 0; j--) {
        System.out.print("*");
      }
      num02--;
      System.out.println();
    }*/

    // 4
    /*System.out.print("알파벳 입력 >> ");
    String input = sc.nextLine();
    char ch = input.charAt(0);
    int num = (int) ch;
    int countI = 5;
    int countJ = 5;
    int countPlus = 5;
    for (int i = 0; i < countI; i++) {
      for (int j = countJ; j > 0; j--) {
        System.out.print((char) (num - (countPlus - 1)));
      }
      System.out.println();
      countJ--;
      countPlus++;
    }*/

    // 5
    /*int threeArray[] = new int[10];
    for (int i = 0; i < threeArray.length; i++) {
      System.out.print("숫자 입력하세요 >>> ");
      threeArray[i] = sc.nextInt();
    }

    for (int i = 0; i < threeArray.length; i++) {
      if (threeArray[i] % 3 != 0) {
        continue;
      } else {
        System.out.print(threeArray[i] + "\t");
      }
    }*/

    // 6
    /*int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };

    System.out.print("금액은 얼마입니까 >> ");
    int money = sc.nextInt();

    for (int i = 0; i < unit.length; i++) {
      System.out.printf(unit[i] + "원 : " + money / unit[i]);
      money %= unit[i];
      System.out.println("  (남은 돈 : " + money + ")");
    }

   */

    //7
    /*int[] randInt = new int[10];
    //Random rand = new Random();

    double sum = 0;
    for (int i = 0; i < randInt.length; i++) {
      randInt[i] = (int) ((Math.random() * 10000) % 10);
      sum += randInt[i];
    }

    for (int i = 0; i < randInt.length; i++) {
      System.out.print(randInt[i] + " ");
    }
    System.out.println("평균은 : " + sum / randInt.length);*/

    // 8
    /*int num = 0;
    while (true) {
      System.out.println(
        "몇 개의 정수를 가진 배열을 만드시겠습니까? 숫자 입력 >>> "
      );
      num = sc.nextInt();

      if (num > 100 || num < 0) {
        System.out.println("1-100 사이의 정수만 입력");
        continue;
      } else {
        break;
      }
    }
    int numArr[] = new int[num]; //(int)(Math.random()*100)

    for (int i = 0; i < numArr.length; i++) {
      int input = (int) (Math.random() * 100);

      if (input == numArr[i]) {
        continue;
      } else {
        numArr[i] = input;
      }
    }

    for (int item : numArr) {
      System.out.print(item + " ");
    }

    System.out.println();*/

    // 9
    /*int randArr[][] = new int[4][4];

    for (int i = 0; i < randArr.length; i++) {
      for (int j = 0; j < randArr[i].length; j++) {
        randArr[i][j] = (int) (Math.random() * 10);
      }
    }

    for (int i = 0; i < randArr.length; i++) {
      for (int j = 0; j < randArr[i].length; j++) {
        System.out.print(randArr[i][j] + " ");
      }
      System.out.println();
    }*/

    // 10
    /*int randArr[][] = new int[4][4];

    for (int i = 0; i < randArr.length; i++) {
      for (int j = 0; j < randArr[i].length; j++) {
        randArr[(int) (Math.random() * 4)][(int) (Math.random() * 4)] =
          (int) (Math.random() * 10);
      }
    }

    for (int i = 0; i < randArr.length; i++) {
      for (int j = 0; j < randArr[i].length; j++) {
        System.out.print(randArr[i][j] + " ");
      }
      System.out.println();
    }*/

    // 11
    /*try {
      FileReader reader = new FileReader("C:/Temp/test.txt");

      int ch;
      int test[] = new int[3];

      while ((ch = reader.read()) != -1) {
        char a = (char) ch;
        System.out.print(a);
      }

      reader.close();
    } catch (Exception e) {
      System.out.println(e.getMessage());
      System.out.println(e.getStackTrace());
    }*/

    // 13
    int hund[] = new int[99];
    for (int i = 1; i < 100; i++) {
      hund[i - 1] = i;
    }

    for (int i = 0; i < hund.length; i++) {
      int ten = hund[i] / 10;
      int one = hund[i] - (ten * 10);
      int check = hund[i] - ((hund[i] / 10) * 10);

      if (hund[i] < 10) {
        if (one % 3 == 0) {
          System.out.println(hund[i] + ":박수 짝");
        }
      } else if (ten % 3 == 0 && one % 3 == 0) {
        System.out.println(hund[i] + ": 박수 짝짝");
      } else if (ten % 3 != 0 && one % 3 == 0 && check != 0) {
        System.out.println(hund[i] + ": 박수 짝");
      } else if (ten % 3 == 0 && one % 3 != 0) {
        System.out.println(hund[i] + ": 박수 짝");
      }
    }

    // 14
    /*String[] course = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
    int[] score = { 95, 88, 76, 62, 55 };

    System.out.print("검색할 과목 >>> ");
    String search = sc.next();

    for (int i = 0; i < course.length; i++) {
      if (search.equals(course[i])) {
        System.out.println(search + "의 성적 : " + score[i]);
        break;
      } else {
        System.out.println("그런 과목은 없습니다.");
        break;
      }
    }*/

    // 15
    /*try {
      System.out.println("곱하고자 하는 두 수를 입력");
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      System.out.println("num1 x num2 = " + (num1 * num2));
    } catch (Exception e) {
      System.out.println(e.getMessage() + e.getStackTrace());
    }
  */
    sc.close();
  }
}
