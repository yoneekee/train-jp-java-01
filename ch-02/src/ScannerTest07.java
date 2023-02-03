import java.util.Scanner;

public class ScannerTest07 {

  public static void main(String[] args) {
    String plus = " + ";
    String minus = " - ";
    String divide = " ÷ ";
    String multiple = " x ";
    String thisIs = " = ";

    Scanner sc = new Scanner(System.in);
    /*System.out.print("첫번째 수 입력 : ");
    int num1 = sc.nextInt();
    System.out.print("두 번째 수 입력 : ");
    int num2 = sc.nextInt();
    System.out.print("연산 종류 선택  (+, -, x, /) : ");
    String cal = sc.next();*/

    System.out.println(
      "식을 입력하세요 ex. 1 + 2.. 2 / 5... (띄어쓰기를 인식하여 계산합니다)"
    );
    String input = sc.nextLine();
    char[] inputs = input.toCharArray();
    int num1 = Character.getNumericValue(inputs[0]);
    int num2 = Character.getNumericValue(inputs[4]);
    String cal = String.valueOf(inputs[2]);

    /*if (num1 == 0 || num2 == 0) {
      System.out.println("0을 사용하여 나눌 수 없습니다.");
    } else if (cal.equals("+")) {
      System.out.println(num1 + plus + num2 + thisIs + (num1 + num2));
    } else if (cal.equals("-")) {
      System.out.println(num1 + minus + num2 + thisIs + (num1 - num2));
    } else if (cal.equals("x")) {
      System.out.println(num1 + multiple + num2 + thisIs + (num1 * num2));
    } else if (cal.equals("/")) {
      System.out.println(
        num1 + divide + num2 + thisIs + (double) ((double) num1 / (double) num2)
      );
    } else {
      System.out.println("예외 발생");
    }*/

    switch (cal) {
      case "+":
        System.out.println(num1 + plus + num2 + thisIs + (num1 + num2));
        break;
      case "-":
        System.out.println(num1 + minus + num2 + thisIs + (num1 - num2));
        break;
      case "x":
        System.out.println(num1 + multiple + num2 + thisIs + (num1 * num2));
        break;
      case "/":
        if (num1 == 0 || num2 == 0) {
          System.out.println("0을 사용하여 나눌 수 없음");
          break;
        }
        System.out.println(
          num1 +
          divide +
          num2 +
          thisIs +
          (double) ((double) num1 / (double) num2)
        );
        break;
      default:
        System.out.println("예외 발생");
    }
    sc.close();
  }
}
