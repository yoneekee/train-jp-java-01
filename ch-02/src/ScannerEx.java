import java.util.Scanner;

/**
 * ScannerEx
 */
public class ScannerEx {

    public static void main(String[] args) {
        // 레퍼런스 타입
        Scanner sc = new Scanner(System.in);
        
        System.out.print("1. 입력할 값 ==> ");
        String a = sc.nextLine();
        System.out.println("1. 입력받은 값 ==> " + a);

        System.out.print("2. 입력할 값 ==> ");
        String b = sc.next();
        System.out.println("2. 입력받은 값 ==> " + b);

        System.out.print("3. 입력할 값 (정수only) ==> ");
        int c = sc.nextInt();
        System.out.println("3. 입력받은 값 ==> " + c);

        sc.close();
    }
}