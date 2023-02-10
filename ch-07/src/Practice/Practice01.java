package Practice;

import java.util.Scanner;
import java.util.Vector;

public class Practice01 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Vector<Integer> vec = new Vector<>();
    int biggest = 0;

    while (true) {
      System.out.print("정수 입력 (until -1) >> ");
      int num01 = sc.nextInt();
      if (num01 == -1) break;

      vec.add(num01);
    }

    for (int i = 0; i < vec.size() - 1; i++) {
      if (vec.get(biggest) < vec.get(i)) {
        biggest = i;
      }
    }

    System.out.println("제일 큰 수는 : " + vec.get(biggest));
    sc.close();
  }
}
