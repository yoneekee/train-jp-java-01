public class Logical {

  public static void main(String[] args) {
    System.out.println(3 > 2);
    System.out.println(3 < 2);
    System.out.println(3 == 2);
    System.out.println(3 != 2);
    System.out.println(!(3 != 2));
    System.out.println(3 > 2);
    System.out.println(3 > 2 && 3 > 4);

    int a = 10;
    int b = 5;
    int s = a > b ? 1 : -1;
    System.out.println(s);
  }
}
