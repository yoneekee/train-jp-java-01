public class Loop02 {

  public static void main(String[] args) {
    int i = 1;
    int sum = 0;

    while (i <= 10) {
      sum += i;
      System.out.print(i);
      if (i < 10) {
        System.out.print(" + ");
      } else {
        System.out.print(" = " + sum);
      }
      i++;
    }
  }
}
