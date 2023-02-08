class Impl implements CalcInterface {

  @Override
  public int add(int x, int y) {
    return x + y;
  }

  @Override
  public int subtract(int a, int b) {
    return a - b;
  }

  @Override
  public double average(int a[]) {
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }
    return sum / a.length;
  }
}

public class CalcInterfaceSpec {

  public static void main(String[] args) {
    Impl ip = new Impl();
    int[] arr = { 3, 5, 6, 7, 1 };
    System.out.println(ip.add(1, 2));
    System.out.println(ip.subtract(arr[4], arr[2]));
    System.out.println(ip.average(arr));
  }
}
