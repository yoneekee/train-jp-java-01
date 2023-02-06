public class Book {

  private String title;
  private String author;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  public Book(String title) {
    //this.title = title;
    //this.author = "작자미상";
    this(title, "작자미상");
  }

  public Book() {
    //this.title = "제목미상";
    //this.author = "작자미상";
    this("작자미상", "제목미상");
    // 매개변수 두 개를 가진 생성자를 아무 파라미터도 없는 이 생성자가 호출함
  }

  public void showInfo() {
    System.out.println("책 제목 : " + title + " // 저자 : " + author);
  }
}
