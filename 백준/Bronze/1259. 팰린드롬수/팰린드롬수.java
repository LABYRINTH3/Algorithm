
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

    public boolean isPalindrome(String nextLine){
        char[] line = nextLine.toCharArray();
        for (int i = 0; i < line.length/2; i++) {
            if (line[i] != line[line.length - (i+1)]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        Main p = new Main();
        while (true) { 
            String nextLine = br.readLine();
            if (nextLine.equals("0")) {
                break;
            }
            else if (p.isPalindrome(nextLine) == true) {
                answer.append("yes\n");
            }
            else if (p.isPalindrome(nextLine) == false) {
                answer.append("no\n");
            }
        }
        System.out.println(answer);
    }
}
