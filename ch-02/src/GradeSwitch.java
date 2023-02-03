import java.util.Scanner;

public class GradeSwitch {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("성적을 입력하세요 (0~100)");
    int score = sc.nextInt();
    String grade;

    switch (score / 10) {
      case 10:
      case 9:
        grade = "A";
        break;
      case 8:
        grade = "B";
        break;
      case 7:
        grade = "C";
        break;
      case 6:
        grade = "D";
        break;
      case 5:
      case 4:
      case 3:
      case 2:
      case 1:
        grade = "F";
        break;
      default:
        grade = "N";
        break;
    }

    if (grade == "N") {
      System.out.println("올바른 점수입력이 아닙니다.");
    } else {
      System.out.println(
        "당신의 점수는 " + score + " / 당신의 학점은 " + grade
      );
    }

    sc.close();
  }
}
