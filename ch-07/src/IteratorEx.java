import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {

  public void main(String[] args) {
    Vector<Integer> vec = new Vector<>();
    vec.add(1);
    vec.add(2);
    vec.add(2, 3);
    vec.add(88);
    vec.add(77);
    vec.add(99);

    Iterator<Integer> it = vec.iterator(); // 순환 가능한지 아닌지
    int sum = 0;

    while (it.hasNext()) {
      int num = it.next();
      System.out.print(num + " : " + it.hasNext() + "\n");
      sum += num;
    }

    System.out.println("sum : " + sum);
  }
}
