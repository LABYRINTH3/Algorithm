import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int A = Integer.parseInt(input[1]);

        int[] coins = new int[N];
        for (int i = 0; i < N; i++) {
            int coin = Integer.parseInt(br.readLine());
            coins[i] = coin;
        }

        int count = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (A >= coins[i]) {
                count += A / coins[i];
                A = A % coins[i];
            }
        }
        System.out.println(count);
    }
}
