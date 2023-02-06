/**
 * Rectangle
 */
public class Rectangle {

  public Rectangle() {
    System.out.println("생성자 호출");
  }

  int width;
  int height;

  double getArea() {
    return width * height;
  }

  int getBound() {
    return (width + height) * 2;
  }

  public static void main(String[] args) {
    Circle circle = new Circle(10);
    System.out.println("원의 둘레 : " + circle.radius);

    Rectangle rec = new Rectangle();
    rec.width = 10;
    rec.height = 20;
    double recArea = rec.getArea();
    int recBound = rec.getBound();
    System.out.println();
    System.out.println("사각형의 넓이 : " + recArea);
    System.out.println("사각형의 둘레 : " + recBound);
  }
}
