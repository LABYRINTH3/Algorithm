
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int a = 1;
        int b = 1;
        for (int i = 0; i < K; i++) {
            a = a * N;
            b = b * (i+1);
            N--;
        }
        System.out.println(a/b);
    }
}
