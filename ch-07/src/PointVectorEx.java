import java.util.Vector;

class Point {

  int x;
  int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public String toString() {
    return "(" + x + ", " + y + ")";
  }
}

public class PointVectorEx {

  public static void main(String[] args) {
    Vector<Point> vec = new Vector<>();
    vec.add(new Point(1, 2));
    vec.add(new Point(2, 2));
    vec.add(new Point(3, 3));
    System.out.println(vec.get(0));
  }
}
