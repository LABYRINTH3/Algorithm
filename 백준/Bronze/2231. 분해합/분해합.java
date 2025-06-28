
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int num;
        try (Scanner sc = new Scanner(System.in)) {
            num = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            char[] chars = (Integer.toString(i)).toCharArray();
                    int sum = 0;
            for (char elem : chars) {
                sum += elem - '0';
            }
            if (sum + i == num) {
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println("0");
    }
}