package Practice;

// 6번 문제

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

class Location {

  private String cityName;
  private String latitude;
  private String longitude;

  public String getCityName() {
    return this.cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public String getLatitude() {
    return this.latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public String getLongitude() {
    return this.longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }
}

public class Practice06 {

  public static void main(String[] args) {
    HashMap<String, Location> locations = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 4; i++) {
      Location lc = new Location();
      System.out.print("도시이름, 위도, 경도를 입력하세요 >>>> ");
      String loca = sc.nextLine();
      String[] location = loca.split(", ");
      lc.setCityName(location[0]);
      lc.setLatitude(location[1]);
      lc.setLongitude(location[2]);
      locations.put(lc.getCityName(), lc);
    }

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
    sc.close();
  }
}
