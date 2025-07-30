
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            Map<Integer, List<String>> sMap = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                String a = sc.next();
                int length = a.length();
                if (!sMap.containsKey(length)) {
                    sMap.put(length, new ArrayList<>());
                }
                sMap.get(length).add(a);
            }
            for (int i = 1; i < 51; i++) {
                List<String> byLength = sMap.get(i);
                if (byLength!=null && !byLength.isEmpty()) {
                    Collections.sort(byLength);
                    String check = null;
                    for (String elem : byLength) {
                        if (!elem.equals(check)) {
                            System.out.println(elem);
                        }
                        check = elem;
                    }
                }
            }
        }
    }
}
