
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String givenString = sc.next();
        sc.close();

        char[] stringtoChar = givenString.toCharArray();
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);
        for (int i = 0; i < stringtoChar.length; i++) {
            if (alphabet[stringtoChar[i]-'a'] == -1)
                alphabet[stringtoChar[i]-'a'] = i;
        }
        for (int j = 0; j < 25; j++) {
            System.out.print(alphabet[j] + " ");
        }
        System.out.print(alphabet[25]);
    }
}
