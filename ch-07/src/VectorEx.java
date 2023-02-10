import java.util.Vector;

public class VectorEx {

  public static void main(String[] args) {
    Vector<Integer> vec = new Vector<>();

    vec.add(1);
    vec.add(3);
    vec.add(4);

    System.out.println(vec.size());

    vec.add(1, 2);

    for (int i = 0; i < vec.size(); i++) {
      System.out.print(vec.get(i) + "  ");
    }

    System.out.println();

    for (int item : vec) {
      System.out.print(item + "  ");
    }
  }
}
