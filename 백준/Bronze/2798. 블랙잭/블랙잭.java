
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        int best = 0;
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    int sum = num[i]+num[j]+num[k];
                    if (sum > best && sum <= target) {
                        best = sum;
                    }
                    if (sum == target) {
                        break;
                    }
                }
            }
        }
        System.out.println(best);
    }
}
