
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> line = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            line.add(br.readLine());
        }
        int total = Integer.parseInt(line.get(0));
        StringTokenizer st = new StringTokenizer((line.get(1)).trim(), " ");
        int[] size = new int[6];
        for (int j = 0; j < 6; j++) {
            size[j] = Integer.parseInt(st.nextToken());
        }
        String[] string = (line.get(2)).split(" ");
        int shirtBundle = Integer.parseInt(string[0]);
        int penBundle = Integer.parseInt(string[1]);
        
        int sum = 0;
        for (int people : size) {
            if (people % shirtBundle == 0) {
                sum += (people / shirtBundle);
            }
            else
                sum += (people / shirtBundle + 1);
            
        }

        int buyPenBundles;
        int buyPenPiece;
        if (penBundle <= 0) {
            buyPenBundles = 0;
            buyPenPiece = total;
        }
        else { 
            buyPenBundles = total / penBundle; 
            buyPenPiece = total % penBundle;
        }
        
        

        System.out.println(sum);
        System.out.println(buyPenBundles + " " + buyPenPiece);
    }
}

