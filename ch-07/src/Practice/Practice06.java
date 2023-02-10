package Practice;

// 6번 문제

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

class Location {

  private String cityName;
  private Double latitude;
  private Double longitude;

  public String getCityName() {
    return this.cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public Double getLatitude() {
    return this.latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Double getLongitude() {
    return this.longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }
}

class locationManager {

  Location lc;
  HashMap<String, Location> locations = new HashMap<>();
  Scanner sc = new Scanner(System.in);

  public void insertLocation(int num) {
    for (int i = 0; i < num; i++) {
      lc = new Location();
      System.out.print("도시이름, 위도, 경도를 입력하세요 >>>> ");
      String loca = sc.nextLine();
      //String[] location = loca.split(", ");
      StringTokenizer st = new StringTokenizer(loca, ",");

      String cityName = st.nextToken().trim();
      String latitude = st.nextToken().trim();
      String longitude = st.nextToken().trim();
      lc.setCityName(cityName);
      lc.setLatitude(Double.parseDouble(latitude));
      lc.setLongitude(Double.parseDouble(longitude));
      locations.put(lc.getCityName(), lc);
    }
  }

  public void showAll() {
    Iterator<Map.Entry<String, Location>> iteratorE = locations
      .entrySet()
      .iterator();
    System.out.println("-------------");

    while (iteratorE.hasNext()) {
      Map.Entry<String, Location> entry = (Map.Entry<String, Location>) iteratorE.next();
      String key = entry.getKey();
      Location value = entry.getValue();
      System.out.println(
        key + "\t" + value.getLatitude() + "\t" + value.getLongitude()
      );
    }
    System.out.println("-------------");
  }

  public void showInfo() {
    while (true) {
      System.out.print("도시 이름 >>> ");
      String search = sc.next();
      if (search.equals("그만")) break;

      if (locations.containsKey(search)) {
        Location lc = locations.get(search);
        System.out.println(
          lc.getCityName() + "\t" + lc.getLatitude() + "\t" + lc.getLongitude()
        );
      } else {
        System.out.println("그런 나라 없음.");
      }
    }
  }
}

public class Practice06 {

  public static void main(String[] args) {
    //HashMap<String, Location> locations = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    locationManager lm = new locationManager();

    lm.insertLocation(4);
    lm.showAll();
    lm.showInfo();

    sc.close();
  }
}
