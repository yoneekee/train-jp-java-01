/**
 * BookInfo
 */
public class BookInfo {

  public static void main(String[] args) {
    Book b1 = new Book("어린왕자", "생텍쥐페리");
    b1.showInfo();

    Book b2 = new Book("심청전");
    b2.showInfo();

    Book b3 = new Book();
    b3.showInfo();

    b3.setTitle("심청전");
    String bookTitle = b3.getTitle();
    System.out.println(bookTitle);
    b3.showInfo();
  }
}
