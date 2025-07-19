import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iteration = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int bitset = 0; 
        for (int i = 0; i < iteration; i++){
            String[] commandSplit = (br.readLine()).split(" ");
            int num;
            switch (commandSplit[0]) {
                case "add":
                    num = Integer.parseInt(commandSplit[1]);
                    bitset |= (1 << (num -1));
                    break;
                case "remove":
                    num = Integer.parseInt(commandSplit[1]);
                    bitset = bitset & ~(1 << (num - 1));
                    break;
                case "check":
                    num = Integer.parseInt(commandSplit[1]);
                    if ((bitset & (1 << (num - 1))) != 0){
                        sb.append("1\n");
                    }
                    else {
                        sb.append("0\n");
                    }
                    break;
                case "toggle":
                    num = Integer.parseInt(commandSplit[1]);
                    bitset ^= (1 << (num - 1));
                    break;
                case "all":
                    bitset |= (~0);
                    break;
                case "empty":
                    bitset &= 0;
                    break;
                default:
                    break;
            }
        }
        System.out.println(sb);
    }
}
