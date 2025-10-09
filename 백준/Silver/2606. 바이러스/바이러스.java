import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        // 컴퓨터의 수 -> 각 노드 방문 했는지 확인
        boolean[] visited = new boolean[n + 1];
        visited[1] = true;

        // 1번 컴퓨터와 연결되어있는 컴퓨터 행렬
        Queue<Integer> connected = new LinkedList<Integer>();
        connected.add(1);

        // 감염된 컴퓨터 세기
        int infectedCount = 0;

        int m = Integer.parseInt(br.readLine());
        int[][] list = new int[m][2];
        boolean[] checkList = new boolean[m];
        for (int i = 0; i < m; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            list[i][0] = a;
            list[i][1] = b;
        }

        while (!connected.isEmpty()) {
            int current = connected.poll();
            for (int i = 0; i < m; i++) {
                if (list[i][0] == current && !visited[list[i][1]] && !checkList[i]) {
                    visited[list[i][1]] = true;
                    connected.add(list[i][1]);
                    checkList[i] = true;
                    infectedCount++;
                } else if (list[i][1] == current && !visited[list[i][0]] && !checkList[i]) {
                    visited[list[i][0]] = true;
                    connected.add(list[i][0]);
                    checkList[i] = true;
                    infectedCount++;
                }
            }
        }
        System.out.println(infectedCount);

    }
}
