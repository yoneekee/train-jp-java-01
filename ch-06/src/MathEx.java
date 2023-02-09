import java.util.Arrays;

public class MathEx {

  public static boolean exist(int num, int[] numArr) {
    for (int i = 0; i < numArr.length; i++) {
      if (num == numArr[i]) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(Math.PI);
    System.out.println(Math.ceil(3.14));
    System.out.println(Math.floor(Math.PI));
    System.out.println(Math.sqrt(9)); // 루트(제곱근) 구하기
    System.out.println(Math.exp(2)); // e^x(:파라미터) 값을 반환 (자연상수 e : 2.71)
    System.out.println(Math.round(Math.PI));

    int[] count = new int[6];
    int index = 0;

    for (int i = 0; i < count.length; i++) {
      do { // 중복 안 되게 로또 번호 추출
        index = (int) (Math.random() * 45) + 1;
      } while (MathEx.exist(index, count));
      count[i] = index;
    }

    Arrays.sort(count); // 오름차순 정렬
    for (int i = 0; i < count.length; i++) {
      System.out.print(count[i] + " ");
    }
  }
}
/*
 * 출력
3.141592653589793
4.0
3.0
3.0
7.38905609893065
3
1 2 6 26 37 42
 */
