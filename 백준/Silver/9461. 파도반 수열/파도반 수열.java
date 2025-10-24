import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[101];
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        arr[4] = 2;
        arr[5] = 2;
        for (int i = 0; i < n; i++) {
            int n2 = Integer.parseInt(br.readLine());
            if (n2 > 5) {
                for (int j = 6; j <= n2; j++) {
                    arr[j] = arr[j-5] + arr[j-1];
                }
            }
            sb.append(arr[n2]).append("\n");
        }
        System.out.print(sb);
    }
}