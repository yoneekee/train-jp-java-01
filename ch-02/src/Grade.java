import java.util.Scanner;

public class Grade {

  public static void main(String[] args) {
    System.out.println("점수를 입력하세요 : 0 ~ 100");
    Scanner sc = new Scanner(System.in);
    int score = sc.nextInt();
    char grade;

    if (score > 90 && score <= 100) {
      grade = 'A';
    } else if (score > 80) {
      grade = 'B';
    } else if (score > 70) {
      grade = 'C';
    } else if (score > 0 && score <= 70) {
      grade = 'F';
    } else {
      System.out.println("범위가 올바르지 않은 점수입니다.");
      grade = 'N';
    }

    System.out.println(
      "당신의 점수는 : " + score + " // 당신의 성적은 : " + grade
    );

    sc.close();
  }
}
