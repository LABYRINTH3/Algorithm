
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String st = sc.next();
        char[] ch = st.toCharArray();
        int i = 0;
        long sum = 0;
        for (char elem : ch) {
            int a = (elem-'a') + 1;
            sum = (int) (sum + a*Math.pow(31, i));
            i++;
        }
        System.out.println(sum % 1234567891);
    }
}
