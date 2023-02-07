package Practice;

import java.util.Scanner;

public class Practice01 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("곡명 입력 >> ");
    String title = sc.nextLine();
    System.out.print("가수명 입력 >> ");
    String artist = sc.nextLine();
    System.out.print("나라명 입력 >> ");
    String country = sc.nextLine();
    System.out.print("발매년도 입력 >> ");
    int year = sc.nextInt();

    Song s = new Song(title, artist, year, country);
    s.show();

    sc.close();
  }
}
