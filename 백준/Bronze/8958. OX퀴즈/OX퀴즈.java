
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iteration = Integer.parseInt(br.readLine());
        String[] data = new String[iteration];
        for (int i = 0; i < iteration; i++) {
            data[i] = br.readLine();
        }
        for (int j = 0; j < iteration; j++) {
            int totalScore = 0;
            int qusetionScore = 0;
            char[] data2 = data[j].toCharArray();
            for (char output : data2) {
                if (output == 'O') {
                    qusetionScore++;
                    totalScore += qusetionScore;
                }
                else
                    qusetionScore = 0;
            }
            System.out.println(totalScore);
        }

    }
}
