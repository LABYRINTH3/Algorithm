import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        int status = 0;

        boolean no = false;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int nextNum = Integer.parseInt(br.readLine());
            if (st.search(nextNum) == -1) {
                if (status < nextNum) {
                    while (status < nextNum) {
                        sb.append("+").append("\n");
                        status++;
                        st.push(status);
                    }
                    st.pop();
                    sb.append("-").append("\n");
                }
                else {
                    no = true;
                }
            }
            else {
                if (nextNum != st.peek()) {
                    no = true;
                }
                else {
                    st.pop();
                    sb.append("-").append("\n");
                }
            }
        }

        if (no)
            System.out.println("NO");
        else
            System.out.println(sb);
    }
}