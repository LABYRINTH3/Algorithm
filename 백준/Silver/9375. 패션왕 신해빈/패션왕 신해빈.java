import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int n2 = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();
            for (int j = 0; j < n2; j++) {
                String[] clothes = br.readLine().trim().split(" ");
                if (map.containsKey(clothes[1])) {
                    int count = map.get(clothes[1]);
                    map.put(clothes[1], count + 1);
                }
                else{
                    map.put(clothes[1], 1);
                }
            }
            int answer = 1;
            for (String key : map.keySet()) {
                answer = answer * (map.get(key)+1);
            }
            sb.append(answer-1).append("\n");
        }
        System.out.println(sb);
    }
}