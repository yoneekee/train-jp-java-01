package Practice;

public class Rectangle {

  int x;
  int y;
  int width;
  int height;

  public Rectangle(int x, int y, int width, int height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  public int square() {
    return width * height;
  }

  public void show() {
    System.out.println(
      "x " + x + "y " + y + " 의 넓이가 " + width + " 높이가 " + height
    );
  }
}
