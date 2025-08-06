
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[1000000];
        for (int i = 0; i < n; i++) {
            num[i] = i+1;
        }
        int start = 0;
        int end = n-1;
        boolean iter = true;
        while (start < end) {
            if (iter) {
                start++;
                iter = false;
            }
            else {
                num[end+1] = num[start];
                start++;
                end++;
                iter = true;
            }
        }
        System.out.println(num[start]);
    }
}