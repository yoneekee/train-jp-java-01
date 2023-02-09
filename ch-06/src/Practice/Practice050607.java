package Practice;

public class Practice050607 {

  public static void main(String[] args) {
    /** 5
    (1) package device;
    (2) package app; import device.TV;
    */

    /*** 6 */
    // (1)
    // Integer s1 = new Integer(20);
    // int s1Val = s1.intValue();
    // System.out.println(s1Val);
    // (2)
    String str = "35.9";
    double d = Double.valueOf(str);
    System.out.println(d);
    // (3)
    String str2 = "true";
    boolean b = Boolean.valueOf(str2);
    System.out.println(b);
    // (4)
    String biNum = Integer.toBinaryString(30);
    System.out.println(biNum);
    // (5)
    String c = String.valueOf('c');
    System.out.println(c);

    /*** 7 */
    // (1)
    String a = "가나다";
    String b1 = new String(a);
    System.out.println(a + "/" + b1);
    System.out.println(a == b1);
    // false가 나옴. 서로 다른 객체이기 때문.
    // 반면에 -> System.out.println(a.equals(b1)); 이건 true가 나옴

    /*** 8 */
    String a8 = new String("     Oh, Happy      ");
    String b8 = a8.trim();
    String c8 = b8.concat(" Day.");
    System.out.println(a8 + "\n" + b8 + "\n" + c8);
  }
}
