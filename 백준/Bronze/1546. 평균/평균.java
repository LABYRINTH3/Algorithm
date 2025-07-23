
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] m = br.readLine().split(" ");
        int[] nums = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            nums[i] = Integer.parseInt(m[i]);
        }
        int best = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (best < nums[i]) {
                best = nums[i];
            }
        }

        float sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum +  (float) nums[i] / best * 100;
        }
        System.out.println(sum/nums.length);
    }
}
