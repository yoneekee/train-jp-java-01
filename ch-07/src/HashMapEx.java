import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx {

  public static void main(String[] args) {
    // 비교 : 파이썬의 딕셔너리
    HashMap<Integer, String> map = new HashMap<>();

    for (int i = 0; i < 30; i++) {
      map.put(i, "글" + (i + 1));
    }

    for (int i = 0; i < map.size(); i++) {
      if ((i % 10 == 0) && !(i == 0)) System.out.println();
      System.out.print(map.get(i) + "\t");
    }
    System.out.println("\n");

    // Entry 사용
    int count = 0;
    for (Map.Entry<Integer, String> pair : map.entrySet()) {
      if (count % 10 == 0 && count != 0) System.out.println();
      System.out.print(pair.getKey() + ":" + pair.getValue() + "\t");
      count++;
    }
    System.out.println("\n");

    // Iterator 사용
    Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();

    count = 0;
    while (itr.hasNext()) {
      Map.Entry<Integer, String> entry = itr.next();
      if (count % 10 == 0 && count != 0) System.out.println();
      System.out.print(entry.getKey() + ":" + entry.getValue() + "\t");
      count++;
    }
  }
}
