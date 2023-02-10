package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*** 3번 문제 */
public class Practice03 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<String, String> nations = new HashMap<>();

    // 입력해서 HashMap에 넣기
    while (true) {
      System.out.print("나라 이름과 인구 입력 (ex. Korea 5000) >>> ");
      String input = sc.nextLine();

      if (input.equals("그만")) {
        break;
      }

      String[] inputArr = input.split(" ");

      nations.put(inputArr[0], inputArr[1]);
    }

    // 출력하기
    for (Map.Entry<String, String> pair : nations.entrySet()) {
      System.out.print(pair.getKey() + ":" + pair.getValue() + "\t");
    }
    System.out.println("\n");

    // 인구 검색
    while (true) {
      System.out.print("인구 검색 >>> ");
      String searchPop = sc.next();

      if (searchPop.equals("그만")) {
        break;
      }

      if (nations.get(searchPop) != null) {
        System.out.println(searchPop + "의 인구는 " + nations.get(searchPop));
      } else {
        System.out.println(searchPop + "라는 나라는 자료에 없습니다.");
      }
    }

    sc.close();
  }
}
