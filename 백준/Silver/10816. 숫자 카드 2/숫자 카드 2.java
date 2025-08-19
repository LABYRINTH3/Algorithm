
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] count = new int[20000001];
        int n = Integer.parseInt(br.readLine());
        String[] numsIn = (br.readLine()).trim().split(" ");
        for (String elem : numsIn) {
            count[Integer.parseInt(elem)+10000000]++;
        }
        int k = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String[] countNum = (br.readLine()).trim().split(" ");
        for (String elem : countNum) {
            sb.append(count[Integer.parseInt(elem)+10000000]).append(" ");
        }
        System.out.println(sb);
    
    }
}
