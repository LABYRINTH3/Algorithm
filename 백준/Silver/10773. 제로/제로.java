
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> money = new Stack<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int get = sc.nextInt();
            if (get == 0)
                money.pop();
            else
                money.add(get);
        }

        int sum = 0;
        while (!money.empty()) {
            int get = money.pop();
            sum += get;
        }

        System.out.println(sum);
    }
}
