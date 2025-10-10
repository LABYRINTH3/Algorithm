import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    
    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static int calculate(int a, int b, int c) {
        return factorial(a + b + c) / (factorial(a) * factorial(b) * factorial(c));
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int sum = 0;
            int num = Integer.parseInt(br.readLine());
            for (int j = 0; j <= num; j++) {
                for (int j2 = 0; j2 <= num/2; j2++) {
                    for (int k = 0; k <= num/3; k++) {
                        if (j + j2*2 + k*3 == num) {
                            int result = calculate(j, j2, k);
                            sum += result;
                        }
                    }
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}
