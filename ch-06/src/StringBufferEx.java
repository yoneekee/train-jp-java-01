import java.util.StringTokenizer;

public class StringBufferEx {

  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("This");
    System.out.println(sb);

    sb.append(" is pencil.");
    System.out.println(sb);

    sb.insert(8, "my "); // 8번째 인덱스에 my를 추가할 것
    System.out.println(sb);

    sb.replace(8, 10, "your"); // 8-10번째 인덱스를 your로 바꿀 것
    System.out.println(sb);

    sb.delete(8, 13); // 8-13 인덱스를 지울 것
    System.out.println(sb);

    String query = "name=kitae&addr=seoul&age=21";
    StringTokenizer st = new StringTokenizer(query, "&"); // 쿼리를 &기준으로 잘라서 객체로 보관하겠다
    while (st.hasMoreTokens()) {
      System.out.print(st.nextToken() + "\t");
    }
    System.out.println();
    for (int i = 0; i < st.countTokens(); i++) {
      System.out.print(st.nextToken() + "\t");
    }

    String txt = "릴리/아이리스/로즈/아네모네";
    String[] txtArr = txt.split("/"); // 문장을 /기준으로 잘라서 배열로 보관하겠다
    for (int i = 0; i < txtArr.length; i++) {
      System.out.print(txtArr[i] + "\t");
    }
    System.out.println();

    String txt02 = "릴리/아이리스/로즈/아네모네:토끼:고양이:강아지";
    StringTokenizer st02 = new StringTokenizer(txt02, ":/");
    // :와 / 둘 다기준으로 하여 잘라 객체로 보관하겠다
    while (st02.hasMoreTokens()) {
      System.out.print(st02.nextToken() + "\t");
    }
    System.out.println();
  }
}
