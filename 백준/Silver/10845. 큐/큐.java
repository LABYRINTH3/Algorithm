
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> qu = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String[] inputString = (br.readLine()).trim().split(" ");
            if (inputString[0].equals("push")) {
                int k = Integer.parseInt(inputString[1]);
                qu.add(k);
            }
            else if (inputString[0].equals("pop")) {
                if (!qu.isEmpty()) {
                    int k = qu.poll();
                    sb.append(k).append("\n");
                }
                else sb.append("-1").append("\n");
            }
            else if (inputString[0].equals("size")) {
                sb.append(qu.size()).append("\n");
            }
            else if (inputString[0].equals("empty")) {
                if (!qu.isEmpty()) sb.append("0").append("\n");
                else sb.append("1").append("\n");
            }
            else if (inputString[0].equals("front")) {
                if (!qu.isEmpty()) {
                    int k = qu.peek();
                    sb.append(k).append("\n");
                }
                else sb.append("-1").append("\n");
            }
            else if (inputString[0].equals("back")) {
                if (!qu.isEmpty()) {
                    int k = qu.getLast();
                    sb.append(k).append("\n");
                }
                else sb.append("-1").append("\n");
            }
        }
        System.out.println(sb);
    }
}
