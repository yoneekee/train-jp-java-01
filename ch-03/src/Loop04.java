public class Loop04 {

  public static void main(String[] args) {
    for (int i = 2; i < 10; i++) {
      if (i % 2 == 0) {
        continue;
      }
      for (int j = 1; j < 10; j++) {
        System.out.print(i + " x " + j + " = " + (i * j));
        System.out.print("\t");
      }
      System.out.println();
    }
  }
}
