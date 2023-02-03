import java.util.Scanner;

public class ScannerTest06 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("월 입력");
    int season = sc.nextInt();
    String answer;

    switch (season) {
      case 3:
      case 4:
      case 5:
        answer = "봄";
        break;
      case 6:
      case 7:
      case 8:
        answer = "여름";
        break;
      case 9:
      case 10:
      case 11:
        answer = "가을";
        break;
      case 12:
      case 1:
      case 2:
        answer = "겨울";
        break;
      default:
        answer = "이상한 거 입력함";
    }

    System.out.println(season + "월의 계절은 " + answer);

    if (season >= 3 && season <= 5) {
      answer = "봄";
    } else if (season >= 6 && season <= 8) {
      answer = "여름";
    } else if (season >= 9 && season <= 11) {
      answer = "가을";
    } else if (season == 12 && season == 1 && season == 2) {
      answer = "겨울";
    } else {
      answer = "이상한 거 입력함";
    }

    System.out.println(season + "월의 계절은 " + answer);

    sc.close();
  }
}
