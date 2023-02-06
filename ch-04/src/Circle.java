/**
 * Circle
 */
public class Circle {

  public double radius;
  public String name;

  public Circle() { // 생성자
    System.out.println("나는 Circle (객체 생성하면 출력)");
  }

  public Circle(int r) {
    radius = r;
  }

  public double getArea() {
    return 3.14 * radius * radius;
  }
}
