public class Loop01 {

  public static void main(String[] args) {
    int sum = 0;

    /*System.out.print("i : ");
    for (int i = 0; i < 10; i++) {
      sum += (i + 1);
      System.out.print((i + 1) + " ");
    }
    System.out.print("\nsum : " + sum);*/

    for (int i = 1; i <= 10; i++) {
      sum += i;
      System.out.print(i);
      if (i < 10) {
        System.out.print(" + ");
      } else {
        System.out.print(" = ");
        System.out.print(sum);
      }
    }
  }
}
