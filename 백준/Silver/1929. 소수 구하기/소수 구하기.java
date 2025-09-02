import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean[] decimal = new boolean[b+2];
        if (a == 1) {
            decimal[1] = true;
        }
        for (int i = 2; i < b+1; i++) {
            if (decimal[i] == false) {
                int sum = 2 * i;
                while (b >= sum) {
                    decimal[sum] = true;
                    sum += i;
                }
            }
        }
        // true면 소수 아님 false면 소수
        for (int i = a; i < b+1; i++) {
            if (decimal[i] == false) {
                System.out.println(i);
            }
        }
    }
}
