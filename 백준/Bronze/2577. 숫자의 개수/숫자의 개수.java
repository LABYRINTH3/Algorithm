
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt(); 
        int result = a * b *c;
        sc.close();
        String strings = Integer.toString(result);
        int[] count = new int[10];
        for (int i = 0; i < strings.length(); i++) {
            int num = strings.charAt(i)-'0';
            count[num]++;
        }

        for (int j = 0; j < 10; j++) {
            System.out.println(count[j]);
        }
    }
}
