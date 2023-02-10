package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

class ScholarManager {

  HashMap<String, Double> maps = new HashMap<>();
  Scanner sc = new Scanner(System.in);

  public void insertScholar(int num) {
    for (int i = 0; i < num; i++) {
      System.out.print("이름, 학점을 입력 (홍길동 4.1) >> ");
      String input = sc.nextLine();
      StringTokenizer st = new StringTokenizer(input, " ");
      String name = st.nextToken().trim();
      Double grade = Double.parseDouble(st.nextToken().trim());
      maps.put(name, grade);
    }
  }

  public void selectScholar() {
    double scholarGrade = 0;
    String scholarName = "";
    for (Map.Entry<String, Double> pair : maps.entrySet()) {
      if (pair.getValue() > scholarGrade) {
        scholarGrade = pair.getValue();
        scholarName = pair.getKey();
      }
    }

    System.out.print("장학점 기준 >>> ");
    double scholarPoint = sc.nextDouble();

    if (scholarGrade < scholarPoint) {
      System.out.println("기준에 준하는 학생이 없으므로 장학생 선발 유예.");
    } else if (scholarGrade >= scholarPoint) {
      System.out.println(
        "장학생 명단 : " + scholarName + " (" + scholarGrade + ")"
      );
    }
  }
}

// 7번 문제
public class Practice07 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ScholarManager sm = new ScholarManager();

    System.out.print("몇 명의 학생이 장학생 판별 대상입니까 (정수입력) >>> ");
    int num = sc.nextInt();
    sm.insertScholar(num);
    sm.selectScholar();
    sc.close();
  }
}
