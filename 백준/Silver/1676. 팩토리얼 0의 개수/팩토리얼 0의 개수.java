
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int count2 = 0;
        int count5 = 0;
        // int div2 = 2;
        int div5 = 5;
        // while (div2 <= n) {
        //     count2 += n/div2;
        //     div2 = div2 * 2;
        // }
        while (div5 <= n) {
            count5 += n/div5;
            div5 = div5 * 5;
        }
        System.out.println(count5);
    }
}
