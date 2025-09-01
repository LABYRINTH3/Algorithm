import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            nums[i] = k;
        }
        Arrays.sort(nums);
        int a = (int) Math.round(n * 0.15);
        double sum = 0;
        for (int i = a; i < n-a; i++) {
            sum += nums[i];
        }
        System.out.println(Math.round(sum/(n-2*a)));
    }
}