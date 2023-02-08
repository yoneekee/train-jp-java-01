class Point {

  private int x, y;

  public Point(String parent) {
    System.out.println("생성자." + parent);
  }

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void set(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void showPoint() {
    System.out.println("(" + x + ", " + y + ")");
  }

  public void superFunc() {
    System.out.println("superTest");
  }
}

class ColorPoint extends Point {

  private String color;

  public ColorPoint(String child) {
    super(child);
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void showColorPoint() {
    System.out.println(color);
    showPoint();
  }

  public void colorSuperFunc() {
    super.superFunc();
  }
}

public class ColorPointEx {

  public static void main(String[] args) {
    Point p = new Point("parent");
    p.set(1, 2);
    p.showPoint();

    ColorPoint cp = new ColorPoint("child");
    cp.set(3, 4);
    cp.setColor("red");
    cp.showColorPoint();

    Point pp = new ColorPoint("child"); // 자식 클래스의 객체를 만드는데 부모 타입을 참조
    pp.set(1, 2);
    System.out.println(pp.getClass() + ", " + pp.getClass().getSimpleName());
    // p.showColorPoint(); : 자식클래스에서 새롭게 만든 함수는 접근 x
  }
}
