
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iteration = Integer.parseInt(br.readLine());
        String[] strings = new String[iteration];
        for (int i = 0; i < iteration; i++) {
            strings[i] = br.readLine();
        }

        for (int i = 0; i < iteration; i++) {
            String[] newStrings = strings[i].split(" ");
            for (int j = 0; j < newStrings[1].length(); j++) {
                for (int k = 0; k < Integer.parseInt(newStrings[0]); k++) {
                    System.out.print(newStrings[1].charAt(j));
                }
            }
            System.out.println();
        }
    }
}