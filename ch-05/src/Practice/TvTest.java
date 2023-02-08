// 1 - 2
package Practice;

class TV {

  private int size;

  public TV(int size) {
    this.size = size;
  }

  protected int getSize() {
    return size;
  }
}

class ColorTV extends TV {

  private int color;

  public ColorTV(int size, int color) {
    super(size);
    this.color = color;
  }

  protected int getColor() {
    return color;
  }

  public void printProperty() {
    System.out.println(getSize() + "인치 " + color + "색 컬러");
  }
}

class IPTV extends ColorTV {

  private String ip;

  public IPTV(int size, int color, String ip) {
    super(size, color);
    this.ip = ip;
  }

  public void printProperty() {
    System.out.println(
      "나의 IPTV는 " +
      ip +
      " 주소의 " +
      getSize() +
      "인치 " +
      getColor() +
      "컬러"
    );
  }
}

public class TvTest {

  public static void main(String[] args) {
    ColorTV ctv = new ColorTV(32, 1024);
    ctv.printProperty();

    IPTV iptv = new IPTV(32, 1024, "192.1.1.2");
    iptv.printProperty();
  }
}
