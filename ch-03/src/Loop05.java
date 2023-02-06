public class Loop05 {

  public static void main(String[] args) {
    int num = 10;

    for (int i = 0; i < 10; i++) {
      for (int j = num; j > 0; j--) {
        System.out.print("*");
      }
      num--;
      System.out.println();
    }
  }
}
