// 3 - 4
package Practice;

import java.util.Scanner;

abstract class Converter {

  protected abstract double convert(double src);

  protected abstract String getSrcString();

  protected abstract String getDestString();

  protected double ratio;

  protected void run() {
    Scanner sc = new Scanner(System.in);
    System.out.println(
      getSrcString() + "을 " + getDestString() + "로 바꿉니다."
    );
    System.out.print(getSrcString() + "을 입력하세요 >>> ");
    double val = sc.nextDouble();
    double res = convert(val);
    System.out.println("반환 결과 : " + res + getDestString() + "입니다.");
    sc.close();
  }
}

class Won2Dollar extends Converter {

  protected double ratio = 1.35;

  protected double convert(double src) {
    return src * ratio / 1000;
  }

  protected String getSrcString() {
    return "원";
  }

  protected String getDestString() {
    return "달러";
  }
}

class Km2Mile extends Converter {

  protected double ratio = 1.6;

  protected double convert(double src) {
    return src * ratio;
  }

  protected String getSrcString() {
    return "km";
  }

  protected String getDestString() {
    return "mile";
  }
}

public class ConverterEx {

  public static void main(String[] args) {
    // Won2Dollar wd = new Won2Dollar();
    // wd.run();

    Km2Mile km = new Km2Mile();
    km.run();
  }
}
