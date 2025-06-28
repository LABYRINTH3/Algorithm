
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;



public class Main {
    public long penalty(int n, int S, int[][]tv){
        long sum = 0;
        int checkIndex = 0;
        int completeTask = 0;
        Arrays.sort(tv, (a, b) -> a[0] - b[0]);
        PriorityQueue<int[]> timeValue2 = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        while (completeTask < n) {
            while (checkIndex < n && tv[checkIndex][0] <= S) {
                timeValue2.offer(tv[checkIndex]);
                checkIndex++;
            }
            if (!timeValue2.isEmpty()) {
                int[] task = timeValue2.poll();
                sum += (long)(S - task[0]) * task[1];
                completeTask++;
                S++;
            }
            else {
                S = tv[checkIndex][0];
            }
        }
        return  sum;
    }
        
    

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iteration = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < iteration*3; i++) {
            list.add(br.readLine());
        }
        for (int i = 0; i < iteration; i++) {
            String[] a = (list.get(i*3)).split(" ");
            String[] b = (list.get(i*3+1)).split(" ");
            String[] c = (list.get(i*3+2)).split(" ");
            int n = Integer.parseInt(a[0]);
            int S = Integer.parseInt(a[1]);
            int[][] tv = new int[n][2];
            for (int j = 0; j < n; j++) {
                tv[j][0] = Integer.parseInt(b[j]);
                tv[j][1] = Integer.parseInt(c[j]);
            }

            Main calculate = new Main();
            long penalty = calculate.penalty(n, S, tv);
            System.out.println(penalty);
        }
    }
}