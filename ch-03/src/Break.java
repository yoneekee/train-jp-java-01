import java.util.Scanner;

public class Break {
    
    public static void main(String[] args) {
        
        System.out.println("\nexit을 입력하면 종료됩니다.");
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n입력하세요.");
            String text = sc.nextLine();
            if(text.equals("exit")) {
                break;
            }
            if(text.contains("ex")) {
                System.out.println("비슷함.");
                continue;
            }
            System.out.println("아마도...아닌듯?");
        }

        System.out.println("종료됨.");
        sc.close();
    }
}
