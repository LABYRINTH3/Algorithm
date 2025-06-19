
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            nums.add(sc.nextInt());
        }
        sc.close();
        int max = nums.get(0);
        int min = nums.get(0);
        for (int j = 1; j < count; j++) {
            if (max < nums.get(j))
                max = nums.get(j);
            if (min > nums.get(j)) 
                min = nums.get(j);
        }

        System.out.printf("%d %d", min, max);
    }
}
