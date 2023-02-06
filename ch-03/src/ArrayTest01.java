import java.util.Scanner;

public class ArrayTest01 {

  public static void main(String[] args) {
    int intArray[] = new int[5];

    Scanner sc = new Scanner(System.in);
    int max = 0;
    double sum = 0;

    for (int i = 0; i < intArray.length; i++) {
      System.out.print(i + "번째 index를 입력하세요 >> ");
      intArray[i] = sc.nextInt();

      if (intArray[i] > max) {
        max = intArray[i];
      }

      sum += intArray[i];
    }

    for (int i = 0; i < intArray.length; i++) {
      System.out.print(intArray[i] + "\t");
    }

    System.out.println("\nmax : " + max);
    System.out.println("avg : " + sum / intArray.length);
    sc.close();

    String fruits[] = { "berry", "apple", "melon", "orange" };
    for (String item : fruits) {
      System.out.print(item + "\t");
    }
  }
}
