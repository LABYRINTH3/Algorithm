import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        HashMap <String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] sitePass = br.readLine().split(" ");
            map.put(sitePass[0], sitePass[1]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String site = br.readLine();
            sb.append(map.get(site));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
