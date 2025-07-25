
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            int[][] num = new int[row + 1][col];
            for (int j = 0; j < col; j++) {
                num[0][j] = j + 1;
            }
            for (int j = 0; j < row + 1; j++) {
                num[j][0] = 1;
            }
            for (int j = 1; j < row + 1; j++) {
                for (int k = 1; k < col; k++) {
                    num[j][k] = num[j-1][k] + num[j][k-1];
                }
            }
            sb.append(num[row][col-1]);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

// 4 - 1 6 21 56 126 252
// 3 - 1 5 15 35  70 126
// 2 - 1 4 10 20  35  56
// 1 - 1 3  6 10  15  21
// 0 - 1 2  3  4   5   6  7..
