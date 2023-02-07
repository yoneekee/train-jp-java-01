import java.util.ArrayList;

public class CircleTest {

  public static void main(String[] args) {
    Circle c1 = new Circle(10);
    Circle c2 = new Circle(20);
    Circle c3 = new Circle(30);

    ArrayList<Circle> cArr = new ArrayList<>();
    cArr.add(c1);
    cArr.add(c2);
    cArr.add(c3);

    for (Circle item : cArr) {
      System.out.print(item.getR() + " ");
    }
  }
}
