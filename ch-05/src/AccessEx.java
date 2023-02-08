class InnerAccessEx {

  public int a;
  private int b;
  protected int c;
  int d;

  public void setB(int b) {
    this.b = b;
  }

  public int getB() {
    return b;
  }
}

public class AccessEx {

  public static void main(String[] args) {
    InnerAccessEx ex = new InnerAccessEx();
    ex.a = 1;
    ex.setB(2);
    ex.c = 3;
    ex.d = 4;

    System.out.print(ex.a + " " + ex.getB() + " " + ex.c + " " + ex.d + "\n");

    Sample sp = new Sample();
    sp.a = 10;
    sp.setB(20);
    sp.c = 30;
    System.out.print(sp.a + " " + sp.getB() + " " + sp.c + "\n");
  }
}
