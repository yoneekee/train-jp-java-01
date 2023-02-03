import java.util.Scanner;

public class Arithmetic {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력하세요 : ");
        int a = sc.nextInt();
        System.out.print("문자 입력하세요 : ");
        String b = sc.next();

        System.out.println("당신이 입력한 것 ==> " + a + ", " + b);
        sc.close();
    }
}
