
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        int inputInt = sc.nextInt();
        char[] chars = inputString.toCharArray();
        System.out.println(chars[inputInt-1]);
        sc.close();
    }
}
