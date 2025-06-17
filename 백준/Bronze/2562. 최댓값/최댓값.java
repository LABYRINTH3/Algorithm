
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] nums = new Integer[9];
        for (int i = 0; i < 9; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        int best = 0;
        for (int j = 1; j < 9; j++) {
            if (nums[best] < nums[j]) {
                best = j;
            }
        }
        System.out.println(nums[best]);
        System.out.println(best+1);
    }
}
