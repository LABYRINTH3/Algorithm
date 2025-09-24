import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> nums = new PriorityQueue<>();
        String[] numStrings = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            nums.add(Integer.parseInt(numStrings[i]));
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans += nums.poll() * (N-i);
            // System.out.println(ans);
        }
        System.out.println(ans);
    }
}
// 1 2 3 3 4