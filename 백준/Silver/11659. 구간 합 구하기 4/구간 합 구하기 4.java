import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[] arr = new int[n + 1];
        String[] numbers = br.readLine().split(" ");
        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i-1] + Integer.parseInt(numbers[i - 1]);
        }
        for (int i = 0; i < m; i++) {
            String[] ab = br.readLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            int sum = arr[b] - arr[a - 1];
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}
