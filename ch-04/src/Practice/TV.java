package Practice;

public class TV {

  public String maker;
  public int year;
  public int size;

  public TV(String maker, int year, int size) {
    this.maker = maker;
    this.year = year;
    this.size = size;
  }
}
/*
 * private int size;
  private String manufacturer;

  public TV(int size, String manufacturer) {
    this.size = size;
    this.manufacturer = manufacturer;
    System.out.println(size + "인치 " + manufacturer);
  }

  public TV() {
    //size = 32;
    //manufacturer = "LG";
    this(32, "LG");
    //System.out.println(size + "인치 " + manufacturer);
  }

  public TV(String manufacturer) {
    //this.size = 32;
    //this.manufacturer = manufacturer;
    this(32, manufacturer);
  }
*
*/
