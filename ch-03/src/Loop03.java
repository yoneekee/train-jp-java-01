import java.util.ArrayList;
import java.util.Scanner;

public class Loop03 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> arr = new ArrayList<Integer>();
    int sum = 0;

    while (true) {
      System.out.print("정수 입력 하세요 => ");
      int a = sc.nextInt();
      arr.add(a);

      if (a == -1) {
        break;
      }
    }

    for (int i = 0; i < arr.size() - 1; i++) {
      sum += arr.get(i);
    }
    System.out.println(arr);
    System.out.println(sum);

    sc.close();
  }
}
