
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        int check = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i)-'0';
            if (num != -6) {
                if (i % 2 == 0) {
                    sum = sum + num;
                }
                else
                    sum = sum + 3 * num;
            }
            else
                check = i;
        }
        for (int i = 0; i < 10; i++) {
            if (check%2 == 0) {
                if ((sum + i)%10 == 0) {
                    System.out.println(i);
                    break;
                }
            }
            else {
                if ((sum + 3 * i)%10 == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
