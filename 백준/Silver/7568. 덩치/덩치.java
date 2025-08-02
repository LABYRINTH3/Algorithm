
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] height_weight = new int[n][2]; 
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            height_weight[i][0] = x;
            height_weight[i][1] = y;
        }
        int[] biggerthan = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if ((height_weight[i][0]<height_weight[j][0])&&(height_weight[i][1]<height_weight[j][1])) {
                    count++;
                }
            }
            biggerthan[i] = count+1;
        }

        StringBuilder sb = new StringBuilder();
        for (int elem : biggerthan) {
            sb.append(elem);
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
