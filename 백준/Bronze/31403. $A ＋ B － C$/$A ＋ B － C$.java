
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = new String[3];
        for (int i = 0; i < 3; i++) {
            strings[i] = sc.next();
        }
        System.out.println(Integer.parseInt(strings[0])+Integer.parseInt(strings[1])-Integer.parseInt(strings[2]));
        String sumString = strings[0] + strings[1];

        System.out.println(Integer.parseInt(sumString)-Integer.parseInt(strings[2]));
    }
}