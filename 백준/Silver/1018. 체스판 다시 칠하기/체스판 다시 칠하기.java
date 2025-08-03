
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] n = br.readLine().split(" ");
        int row = Integer.parseInt(n[0]);
        int col = Integer.parseInt(n[1]);
        boolean[][] chess = new boolean[row][col];
        boolean[][] chessWhite = new boolean[8][8];
        boolean[][] chessBlack = new boolean[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i+j)%2 == 0) {
                    chessWhite[i][j] = true;
                    chessBlack[i][j] = false;
                }
                else {
                    chessWhite[i][j] = false;
                    chessBlack[i][j] = true;
                }
            }
        }
        // System.out.println(Arrays.toString(chessBlack));
        // System.out.println(Arrays.toString(chessWhite));

        for (int i = 0; i < row; i++) {
            String getline = br.readLine();
            for (int j = 0; j < col; j++) {
                if(getline.charAt(j) == 'W'){
                    chess[i][j] = true;
                }
                else if(getline.charAt(j) == 'B'){
                    chess[i][j] = false;
                }
            }
        }

        int ans = 64;
        for (int i = 0; i < row-7; i++) { // 0 1 2
            for (int j = 0; j < col-7; j++) { // 0 1 2 3 4 5
                int a = 0;
                int b = 0;
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {     // 7 7       9 12
                        if (!(chess[i+k][j+l] == chessBlack[k][l])) {
                            a++;
                        }
                        if (!(chess[i+k][j+l] == chessWhite[k][l])) {
                            b++;
                        }
                    }
                }
                if (a < ans) {
                    ans = a;
                }
                if (b < ans) {
                    ans = b;
                }
            }
        }
        System.out.println(ans);
    }
}