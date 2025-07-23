
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String st = sc.next();

        long result = 0;
        long power = 1;
        for (int i = 0; i < n; i++) {
            int a = st.charAt(i)-'a' + 1;
            result = (result + a * power) % 1234567891;
            power = (power * 31) % 1234567891;
        }
        System.out.println(result);
    }
}
