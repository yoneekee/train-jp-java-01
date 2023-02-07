package Practice;

public class Song {

  private String title;
  private String artist;
  private int year;
  private String country;

  public Song() {
    System.out.println();
  }

  public Song(String title, String artist, int year, String country) {
    this.title = title;
    this.artist = artist;
    this.year = year;
    this.country = country;
  }

  public void show() {
    System.out.println(
      "이 곡은 " +
      title +
      "이고 가수는 " +
      country +
      "출신의 " +
      artist +
      "이며 " +
      year +
      "년에 발매되었습니다."
    );
  }
}
