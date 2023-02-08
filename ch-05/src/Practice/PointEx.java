// 5-8

package Practice;

class Point {

  private int x, y;

  public Point() {}

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  protected void move(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

class ColorPoint extends Point {

  private String color;

  public ColorPoint() {
    setXY(0, 0);
    setColor("BLACK");
  }

  public ColorPoint(int x, int y, String color) {
    super(x, y);
    this.color = color;
  }

  public void setXY(int x, int y) {
    super.move(x, y);
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String toString() {
    String answer = this.color + "색의 " + "(" + getX() + "," + getY() + ") 점";
    return answer;
  }
}

class Point3D extends Point {

  private int z;

  public int getZ() {
    return z;
  }

  public Point3D(int x, int y, int z) {
    super(x, y);
    this.z = z;
  }

  public void moveUp() {
    this.z++;
  }

  public void moveDown() {
    this.z--;
  }

  public void move(int x, int y, int z) {
    super.move(x, y);
    this.z = z;
  }

  public String toString() {
    String answer = "(" + getX() + "," + getY() + "," + getZ() + ") 점";
    return answer;
  }
}

class PositivePoint extends Point {

  @Override
  protected void move(int x, int y) {
    if (x < 0 && y > 0) {
      super.move(getX(), y);
    } else if (y < 0 && x > 0) {
      super.move(x, getY());
    } else if (x < 0 && y < 0) {
      super.move(0, 0);
    } else {
      super.move(x, y);
    }
  }

  public String toString() {
    String answer = "(" + getX() + "," + getY() + ") 점";
    return answer;
  }
}

public class PointEx {

  public static void main(String[] args) {
    // 5
    ColorPoint cp0 = new ColorPoint(5, 5, "yellow");
    cp0.setXY(10, 20);
    cp0.setColor("RED");
    String str0 = cp0.toString();
    System.out.println(str0 + "입니다.");

    // 6
    ColorPoint zeroPoint = new ColorPoint();
    System.out.println(zeroPoint.toString() + "입니다.");

    ColorPoint cp = new ColorPoint(5, 5, "yellow");
    cp.setXY(5, 5);
    cp.setColor("RED");
    String str = cp.toString();
    System.out.println(str + "입니다.");

    // 7
    Point3D pd = new Point3D(1, 2, 3);
    System.out.println(pd.toString() + "입니다.");
    pd.moveUp();
    System.out.println(pd.toString() + "입니다.");
    pd.moveDown();
    pd.move(10, 10);
    System.out.println(pd.toString() + "입니다.");
    pd.move(100, 200, 300);
    System.out.println(pd.toString() + "입니다.");

    // 8
    PositivePoint psp = new PositivePoint();
    psp.move(10, 10);
    System.out.println(psp.toString() + "입니다.");
    psp.move(-5, 10);
    System.out.println(psp.toString() + "입니다.");
    PositivePoint psp2 = new PositivePoint();
    System.out.println(psp2.toString() + "입니다.");
  }
}
