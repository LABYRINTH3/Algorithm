
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            String[] inputString = (br.readLine()).trim().split(" ");
            if (inputString[0].equals("push")) {
                int k = Integer.parseInt(inputString[1]);
                st.push(k);
            }
            else if (inputString[0].equals("pop")) {
                if (!st.empty()) {
                    int k = st.pop();
                    sb.append(k).append("\n");
                }
                else sb.append("-1").append("\n");
            }
            else if (inputString[0].equals("size")) {
                sb.append(st.size()).append("\n");
            }
            else if (inputString[0].equals("empty")) {
                if (!st.empty()) sb.append("0").append("\n");
                else sb.append("1").append("\n");
            }
            else if (inputString[0].equals("top")) {
                if (!st.empty()) {
                    int k = st.peek();
                    sb.append(k).append("\n");
                }
                else sb.append("-1").append("\n");
            }
        }
        System.out.println(sb);
    }
}
