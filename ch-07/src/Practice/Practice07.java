package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice07 {

  public static void main(String[] args) {
    HashMap<String, Double> maps = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
      System.out.print("이름, 학점을 입력 (홍길동 4.1) >> ");
      String input = sc.nextLine();
      String[] scholars = input.split(" ");
      Double grade = Double.parseDouble(scholars[1]);
      maps.put(scholars[0], grade);
    }

    //int genius = 0;
    double scholarGrade = 0;
    String scholarName = "";
    for (Map.Entry<String, Double> pair : maps.entrySet()) {
      if (pair.getValue() > scholarGrade) {
        scholarGrade = pair.getValue();
        scholarName = pair.getKey();
      }
    }

    System.out.println(
      "장학생 명단 : " + scholarName + " (" + scholarGrade + ")"
    );
    sc.close();
  }
}
