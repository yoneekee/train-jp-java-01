public class Circle {

  private int r;
  final double PI = 3.1415;

  public Circle() {}

  public Circle(int r) {
    this.r = r;
  }

  // public void setR(int r) {
  //   this.r = r;
  // }

  public int getR() {
    return r;
  }

  public double areaCircle() {
    return r * r * PI;
  }
}
