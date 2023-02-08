class Shape {

  public void draw() {
    System.out.println("shape");
  }
}

class Line extends Shape {

  public void draw() {
    System.out.println("line");
  }
}

public class MethodOverride {

  public static void main(String[] args) {
    Shape sp = new Shape();
    Line ln = new Line();
    sp.draw();
    ln.draw();
  }
}
