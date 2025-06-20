
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        boolean answer = true;
        for (int i = 0; i < 8; i++) {
            if (i + 1 != Integer.parseInt(nums[i]))
                answer = false;
        }
        if (answer == true) {
            System.out.println("ascending");
            System.exit(0);
        }
        answer = true;
        for (int j = 0; j < 8; j++) {
            if ((8 - j) != Integer.parseInt(nums[j]))
                answer = false;
        }
        if (answer == true) {
            System.out.println("descending");
        }
        else
            System.out.println("mixed");
    }
}
