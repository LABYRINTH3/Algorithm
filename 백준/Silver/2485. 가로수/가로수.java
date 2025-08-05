
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // int[] coordinate = new int[n];
        int[] distance = new int[n-1];
        int c1 = Integer.parseInt(br.readLine());
        for (int i = 0; i < n-1; i++) {
            int c2 = Integer.parseInt(br.readLine());
            // coordinate[i] = a;
            distance[i] = c2-c1;
            c1 = c2;
        }
        List<Integer> dis1Divisor = new ArrayList<>();
        int dis1 = distance[0];
        for (int i = 1; i < Math.sqrt(distance[0])+1; i++) {
            if (dis1%i == 0) {
                dis1Divisor.add(i);
                dis1Divisor.add(dis1/i);
            }
        }
        dis1Divisor.sort(Comparator.reverseOrder()); 
        int ansDiv = 1;
        for (Integer div : dis1Divisor) {
            int check = 0;
            for (int dist : distance) {
                if (dist%div == 0) {
                    check++;
                }
            }
            if (check == n-1) {
                ansDiv = div;
                break;
            }
        }
        int ansTrees = 0;
        for (int dist : distance) {
            ansTrees += (dist/ansDiv-1);
        }
        System.out.println(ansTrees);
    }
}
