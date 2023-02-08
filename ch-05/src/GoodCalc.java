abstract class Calculator {

  public int add(int a, int b) {
    return a + b;
  }

  public abstract int subtract(int a, int b);

  public abstract double average(int a[]);
}

class RealCalc extends Calculator {

  @Override
  public int subtract(int a, int b) {
    return a - b;
  }

  @Override
  public double average(int[] a) {
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }
    return sum / a.length;
  }
}

public class GoodCalc {

  public static void main(String[] args) {
    RealCalc rc = new RealCalc();
    int[] a = { 1, 2, 3, 4, 5 };
    System.out.println(rc.average(a));
    System.out.println(rc.add(1, 2));
    System.out.println(rc.subtract(10, 2));
  }
}
