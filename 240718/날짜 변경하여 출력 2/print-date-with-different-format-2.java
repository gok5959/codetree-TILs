import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        int m = sc.nextInt();
        int d = sc.nextInt();
        int y = sc.nextInt();

        System.out.printf("%d.%d.%d", y, m, d);
    }
}