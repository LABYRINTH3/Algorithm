
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class Main{
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        String[] s1 = br.readLine().strip().split(" ");
        HashSet<Integer> numN = new HashSet<>();
        for (int i = 0; i < n1; i++) {
            int a = Integer.parseInt(s1[i]);
            numN.add(a);
        }
        int n2 = Integer.parseInt(br.readLine());
        String[] s2 = br.readLine().strip().split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n2; i++) {
            int check = Integer.parseInt(s2[i]);
            if (numN.contains(check)) {
                sb.append("1");
                sb.append("\n");
            }
            else {
                sb.append("0");
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}