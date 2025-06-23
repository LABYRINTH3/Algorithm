
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] checkRemainder = new int[42];
        for (int i = 0; i < 10; i++) {
            int remainder = (sc.nextInt()) % 42;
            checkRemainder[remainder]++;
        }
        sc.close();
        int ans = 0;
        for (int nums : checkRemainder) {
            if (nums > 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
