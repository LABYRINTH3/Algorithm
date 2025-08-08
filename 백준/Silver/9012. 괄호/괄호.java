
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> st = getSentence(br);
        StringBuilder sb = new StringBuilder();
        
        for (String oneSent : st) {
            char[] sentToChar = oneSent.toCharArray();
            Stack<Character> count1 = new Stack<>();
            boolean error = false;
            for (char charCheck : sentToChar) {
                if (charCheck == '(') {
                    count1.add(charCheck);
                }
                else if (charCheck == ')') {
                    try {
                        char a = count1.pop();
                        if (!(a == '(')) {
                            error = true;
                        }
                    } catch (EmptyStackException e) {
                        error = true;
                    }
                }
            }
            if (count1.isEmpty() && !error) {
                sb.append("YES\n");
            }
            else if (!count1.isEmpty() || error) {
                sb.append("NO\n");
            }
        }
        System.out.println(sb);
    }

    public static List<String> getSentence(BufferedReader br) throws IOException{
        List<String> st = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String getString = br.readLine().trim();
            st.add(getString);
        }
        return st;
    }
}
