package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice02 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> arrList = new ArrayList<>();

    System.out.print("학점 입력 (A,B,C,D,F) >> ");
    String grade = sc.nextLine();
    for (int i = 0; i <= 10; i += 2) {
      arrList.add(String.valueOf(grade.charAt(i)));
    }

    //int[] avg = {};
    double sum = 0;
    for (int i = 0; i < arrList.size(); i++) {
      double score;
      if (arrList.get(i).equals("A")) {
        score = 4.0;
      } else if (arrList.get(i).equals("B")) {
        score = 3.0;
      } else if (arrList.get(i).equals("C")) {
        score = 2.0;
      } else if (arrList.get(i).equals("D")) {
        score = 1.0;
      } else if (arrList.get(i).equals("F")) {
        score = 0.0;
      } else {
        System.out.println("올바르지 않은 입력.");
        continue;
      }
      sum += score;
    }

    double avg = sum / arrList.size();
    System.out.println("평균은 : " + avg);

    sc.close();
  }
}
