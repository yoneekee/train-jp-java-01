class StaticSample {

  public static int m;
  public int n;

  public void g() {}
}

public class StaticEx {

  public static void main(String[] args) {
    StaticSample s1 = new StaticSample();
    s1.n = 1;
    StaticSample.m = 2;

    for (int i = 0; i < 10; i++) {
      System.out.print((int) (Math.random() * 10) + " ");
    }
  }
}
