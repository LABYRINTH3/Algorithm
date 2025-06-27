
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String getString = br.readLine();
            if (getString.equals("0 0 0")) {
                break;
            }
            list.add(getString);
        }

        for (String given : list) {
            String[] length = given.trim().split(" ");
            int len1 = Integer.parseInt(length[0]);
            int len2 = Integer.parseInt(length[1]);
            int len3 = Integer.parseInt(length[2]);
            int max = len3;
            if (len1 > max || len2 > max) {
                if (len1 > len2) {
                    max = len1;
                    len1 = len3;
                    len3 = max;
                }
                else{
                    max = len2;
                    len2 = len3;
                    len3 = max;
                }
            }

            if (len3*len3 == len1*len1 + len2*len2) {
                System.out.println("right");
            }
            else
                System.out.println("wrong");
        }
    }

}