package Practice;

import java.util.Scanner;

class StringStack implements Stack {

  private String element[];
  private int end;

  public StringStack(int capacity) {
    element = new String[capacity];
    //end = -1;
    end = 0;
  }

  public int length() {
    return 1;
  }

  public int capacity() {
    return 1;
  }

  public String pop() {
    return "";
  }

  public boolean push(String val) {
    if (end == element.length - 1) {
      // Stack이 가득 찼으면
      return false;
    } else {
      element[end] = val;
      end++;
    }
    return true;
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
        System.out.println("스택이 가득차서 종료합니다.");
        break;
      }
    }

    sc.close();
  }
}
