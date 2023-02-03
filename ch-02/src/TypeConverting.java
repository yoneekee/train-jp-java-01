import java.util.Scanner;

public class TypeConverting {
    public static void main(String[] args) {
        byte b = 127;
        double a = (double)b;
        System.out.println("a = " + a);

        byte c = 10;
        int d = 100;
        System.out.println("c + d = " + (c + d));
        System.out.println("10 / 4 = " + (10 / 4));
        System.out.println("10.0 / 4 = " + (10.0 / 4));

        int e = (int)Math.ceil(2.9);
        System.out.println("(int)Math.ceil(2.9) = " + e);

        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 값 ==> ");
        String f = sc.nextLine();
        System.out.println("입력받은 값 ==> " + f);

        sc.close();
    }
}
