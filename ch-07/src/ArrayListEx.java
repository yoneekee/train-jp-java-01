import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

  public static void main(String[] args) {
    ArrayList<String> arrlist = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 4; i++) {
      System.out.print("이름 입력 >> ");
      String name = sc.nextLine();
      arrlist.add(name);
    }

    int longest = 0;
    for (int i = 0; i < arrlist.size(); i++) {
      if (arrlist.get(longest).length() < arrlist.get(i).length()) {
        longest = i;
      }
    }
    System.out.println("이름 제일 긴 사람 : " + arrlist.get(longest));
    sc.close();
  }
}
