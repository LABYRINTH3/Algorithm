import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Integer, List<Integer>> sortByX = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] nums = br.readLine().split(" ");
            int x = Integer.parseInt(nums[0]);
            int y = Integer.parseInt(nums[1]);
            if (!sortByX.containsKey(x)) {
                sortByX.put(x, new ArrayList<>());
            }
            sortByX.get(x).add(y);
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, List<Integer>> elem : sortByX.entrySet()) {
            Integer x = elem.getKey();
            List<Integer> y = elem.getValue();
            Collections.sort(y);
            for (Integer getY : y) {
                sb.append(x);
                sb.append(" ");
                sb.append(getY);
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
