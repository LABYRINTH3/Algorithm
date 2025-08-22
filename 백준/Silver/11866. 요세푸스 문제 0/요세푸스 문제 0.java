
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = (br.readLine()).trim().split(" ");
        int N = Integer.parseInt(nums[0]);
        int K = Integer.parseInt(nums[1]);
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        LinkedList<Integer> qu = new LinkedList<>();
        for (int i = 1; i < N+1; i++) {
            qu.add(i);
        }
        int count = 0;
        int before = K;
        while (!qu.isEmpty()) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            while (before <= N) {
                if (count!=0) {
                    sb.append(", ");
                }
                pq.add(before-1);
                sb.append(qu.get(before-1));
                // System.out.println(qu.get(before-1));
                before = before + K;
                count++;
            }
            while (!pq.isEmpty()) {
                qu.remove((int)pq.poll());
            }
            before = before - N;
            N = qu.size();
        }
        sb.append(">");
        System.out.println(sb);
    }
}
