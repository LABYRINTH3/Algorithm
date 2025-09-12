import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] iter = (br.readLine()).trim().split(" ");
        int nInput = Integer.parseInt(iter[0]);
        int nQuestion = Integer.parseInt(iter[1]);
        String[] pokemon = new String[nInput];
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < nInput; i++) {
            String inputPokemon = (br.readLine()).trim();
            pokemon[i] = inputPokemon;
            map.put(inputPokemon, i+1);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nQuestion; i++) {
            String Question = (br.readLine()).trim();
            if (Question.matches("\\d+")) {
                int k = Integer.parseInt(Question);
                sb.append(pokemon[k-1]).append("\n");
            }   
            else {
                int k = map.get(Question);
                sb.append(k).append("\n");
            }
        }
        System.out.println(sb);
    }
}