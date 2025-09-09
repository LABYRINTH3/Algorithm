import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // -4000 ... 0 ... 4000
        // 0 ..... 4000 .. 8000
        int[] countNums = new int[8001];
        int sum = 0;
        for (int i = 1; i < n+1; i++) {
            int k = Integer.parseInt(br.readLine());
            countNums[k+4000]++;
            sum += k;
        }
        StringBuilder sb = new StringBuilder();

        // 산술평균
        sb.append(Math.round((double)sum/n)).append("\n");

        // 중앙값
        int count = 0;
        boolean middle = true;

        int[] best = new int[2];
        boolean secondSmallest = false;

        int[] range = new int[2];
        boolean firstRange = true;
        for (int i = 0; i < 8001; i++) {
            count+=countNums[i];
            if (count > n/2 && middle) {
                sb.append(i - 4000).append("\n");
                middle = false;
            }
            // 최빈값 - 최빈값이 여러개면 두번째 작은수...
            if (countNums[i] > best[0]) {
                best[0] = countNums[i];
                best[1] = i - 4000;
                secondSmallest = true;
            }
            if (secondSmallest && countNums[i] == best[0] && best[1] != i - 4000) {
                best[1] = i - 4000;
                secondSmallest = false;
            }

            // 범위
            if (firstRange && countNums[i] != 0) {
                range[0] = i - 4000;
                firstRange = false;
            }
        }
        boolean lastRange = true;
        for (int i = 8000; i >= 0; i--) {
            if (lastRange && countNums[i] != 0) {
                range[1] = i - 4000;
                lastRange = false;
                break;
            }
        }
        sb.append(best[1]).append("\n");
        sb.append(range[1]-range[0]).append("\n");

        System.out.println(sb);
    }
}
