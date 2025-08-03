
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Integer, List<String>> user = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            int age = Integer.parseInt(s[0]);
            if (!user.containsKey(age)){
                user.put(age, new ArrayList<>());
            }
            user.get(age).add(s[1]);
        }

        for (Map.Entry<Integer, List<String>> elem : user.entrySet()) {
            Integer getAge = elem.getKey();
            List<String> getName = elem.getValue();
            for (String ss : getName){
                System.out.println(getAge + " " + ss);
            }
        }
    }
}
