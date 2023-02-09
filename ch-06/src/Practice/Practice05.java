package Practice;

import java.util.Calendar;
import java.util.Scanner;

public class Practice05 {

  public static void main(String[] args) {
    /*** 5 ***/
    Calendar now = Calendar.getInstance();
    int hour = now.get(Calendar.HOUR_OF_DAY); //24시간
    //int min = now.get(Calendar.MINUTE);
    //System.out.println(hour + "," + min);

    if (hour > 4 && hour < 12) {
      System.out.println("Good Morning");
    }

    /*** 6 ***/
    Scanner sc = new Scanner(System.in);
    System.out.println("10초에 가까운 사람이 이김");
    System.out.print("황기태 시작 >> ");
    sc.close();
  }
}
