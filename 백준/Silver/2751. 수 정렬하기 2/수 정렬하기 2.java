import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] check = new boolean[2000001];
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            check[input+1000000] = true;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2000001; i++) {
            if (check[i]==true) {
                sb.append(i-1000000);
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
