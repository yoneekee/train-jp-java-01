package Practice;

import java.util.Scanner;
import java.util.Vector;

public class Practice04 {

  public static void main(String[] args) {
    Vector<Integer> vec = new Vector<>();
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.print("강수량 입력 >>> ");
      int rain1 = sc.nextInt();
      if (rain1 == 0) break;
      vec.add(rain1);
      double sum = 0;
      System.out.print("총 강수량 : ");

      for (int i = 0; i < vec.size(); i++) {
        System.out.print(vec.get(i) + "  ");
        sum += vec.get(i);
      }
      System.out.println(" / 현재 평균 : " + (sum / vec.size()));
    }

    sc.close();
  }
}
