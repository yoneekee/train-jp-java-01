package Practice;

import java.util.Scanner;

class StringStack implements Stack {

  private String element[];
  private int end;

  public StringStack(int capacity) {
    element = new String[capacity];
    end = -1;
  }

  public int length() {
    return end + 1;
  }

  public int capacity() {
    return element.length;
  }

  public String pop() {
    if (end == -1) {
      return null;
    } else {
      String popStr = element[end];
      end--;
      return popStr;
    }
  }

  public boolean push(String val) {
    if (end == element.length - 1) {
      return false;
    } else {
      end++; //-1
      element[end] = val;
      //System.out.println("end===" + end);
      return true;
    }
  }
}

public class StackApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("몇 개를 넣는 스택을 만들겠습니까 (자연수) >> ");
    int capacity = sc.nextInt();
    StringStack ss = new StringStack(capacity);

    while (true) {
      System.out.print("문자열 입력 >> ");
      String str = sc.next();

      if (str.equals("그만")) {
        System.out.println("종료합니다.");
        break;
      }

      boolean response = ss.push(str);

      if (response == false) {
        System.out.println("***스택이 이미 가득 차서 종료합니다.***");
        break;
      }
      // System.out.println(
      //   "capacity : " + ss.capacity() + "// length : " + ss.length()
      // );
    }

    int total = ss.length();
    for (int i = 0; i < total; i++) {
      System.out.println("위에서부터 stack 출력 : " + ss.pop());
      //System.out.println(i);
    }

    sc.close();
  }
}
