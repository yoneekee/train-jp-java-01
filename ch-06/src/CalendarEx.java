import java.util.Calendar;

public class CalendarEx {

  public static void main(String[] args) {
    Calendar now = Calendar.getInstance();
    int year = now.get(Calendar.YEAR);
    int month = now.get(Calendar.MONTH) + 1;
    int day = now.get(Calendar.DAY_OF_WEEK);
    //int day2 = now.get(Calendar.DAY_OF_MONTH);
    int hour = now.get(Calendar.HOUR);
    String yoil;

    // prettier-ignore
    if (day == 1) yoil = "일"; 
    else if (day == 2) yoil = "월"; else if (day == 3) yoil = "화"; 
    else if (day == 4) yoil = "수"; else if (day == 5) yoil = "목"; 
    else if (day == 6) yoil = "금"; else if (day == 7) yoil = "토"; 
    else yoil = "None";

    // prettier-ignore
    System.out.println(
      year + "년\t" + month + "월\t" + yoil + "요일(" + day + ")\t" + hour + "시"
    );
    System.out.println(Calendar.HOUR_OF_DAY);
    System.out.println(Calendar.AM_PM);
  }
}
