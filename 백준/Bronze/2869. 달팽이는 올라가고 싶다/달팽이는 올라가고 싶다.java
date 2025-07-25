
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        int V = Integer.parseInt(s[2]);
        int oneDay = A-B;
        int n = (V-A)/oneDay;
        int start = n * oneDay;
        while (start < V) {
            start += A;
            n++;
            if (start >= V) {
                System.out.println(n);
                break;
            }
            start -= B;
        }
    }
}
