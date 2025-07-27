
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[10000];
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine()) - 1;
            num[a] = num[a] + 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            int iter = num[i];
            for (int j = 0; j < iter; j++) {
                sb.append(i+1);
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
